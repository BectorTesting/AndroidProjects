package com.example.routefiberhelps

/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import com.routethis.rtclientnative.*
import java.util.jar.Manifest
import  com.routethis.rtclientnative.RTCNRangeTool

class NetWorkScan : AppCompatActivity() {
    lateinit var rtcnAnalysis : RTCNAnalysis
    lateinit var remoteAssist : RTCNRemoteAssist
    /**
     * There was already an a lateinit var remoteAssist
     * I was not sure about it's purpose, so have decided to leave
     * And start working on my version, by creating another lateinit var
     * Will remove remoteAssist, if required in future
     */

    lateinit var rtcnRemoteAss : RTCNRemoteAssist


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net_work_scan)
        rtcnAnalysis = RTCNAnalysis.getInstance()
        remoteAssist = RTCNRemoteAssist.getInstance()

        rtcnAnalysis.setAnalysisHandler(
            object : RTCNAnalysis.AnalysisHandler {
                override fun onAnalysisStarted() {
                    Log.d("Analysis", "Analysis Has Started")
                }

                override fun onAnalysisCompleted(p0: Boolean) {
                    Log.d("Analysis" , "Analysis Completed")
                }

                override fun onError(err: ERROR_CODE?) {
                    Log.d("Analysis", "Error Reached ${err.toString()}")
                }

                override fun onMissingLocationPermission(): Boolean {
                    Log.d("Analysis", "Missing Location Perms")
                    return true
                }

                override fun onLocationServicesDisabled(): Boolean {
                    Log.d("Analysis", "Missing Location Service")
                    return true
                }
            }
        )
        rtcnAnalysis.setAnalysisProgressHandler(object : RTCNAnalysis.AnalysisProgressHandler {
            override fun onAnalysisProgress(progress: Float, estimatedSecondsRemaning: Int) {
                Log.d("Analysis - Progress", "Progress: $progress, Seconds Remaining: $estimatedSecondsRemaning")
            }
        })

        rtcnAnalysis.setAnalysisDataPersistHandler(object : RTCNAnalysis.DataPersistHandler {
            override fun onDataPersisted() {
                Log.d("Analysis - persist", "Data successfully saved to server")
            }
        })

        rtcnAnalysis.setSelfHelpURLHandler(object : RTCNAnalysis.SelfHelpURLHandler {
            override fun onSelfHelpUrl(url: String?) {
                Log.d("Analysis - URL", "Data saved successfully yo server, url: $url")
            }
        })
        remoteAssist.connectRemoteControlClient()
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        rtcnAnalysis.runQuickAnalysis()

        // SUS-427 : Getting Instance of Range Tool Module | 1.3.4.4
        try {
            rtcnRemoteAss = RTCNRemoteAssist.getInstance()
            Log.d("Remote Assist","Instance was made successfully")
        } catch (e: RTCNException){
            Log.d("Remote Assist","Instance could not be made")
        }

        // SUS-428 : Setting Range Tool Handler | 1.3.4.5
        /**
         * Need implement the interface RTCNRangeTool.RangeToolHandler
         * pass the reference of the implementation object
         * using the method setRTHandler which will set range-tool handler
         */

        class RangeToolHandler : RTCNRangeTool.RangeToolHandler {
            override fun onRangeToolResponse(value : Double) {
                Log.d("Remote Assist", "Recieved Value $value")
            }

            override fun onRangeToolStatus( status : RTCNRangeTool.RANGE_TOOL_STATUS) {
                when (status){
                    RTCNRangeTool.RANGE_TOOL_STATUS.RANGE_TOOL_STARTED -> Log.d("Remote Assist","RANGE_TOOL_STARTED")
                    RTCNRangeTool.RANGE_TOOL_STATUS.RANGE_TOOL_ALREADY_RUNNING -> Log.d("Remote Assist","RANGE_TOOL_ALREADY_RUNNING")
                    RTCNRangeTool.RANGE_TOOL_STATUS.RANGE_TOOL_STOPPED -> Log.d("Remote Assist","RANGE_TOOL_STOPPED")
                    RTCNRangeTool.RANGE_TOOL_STATUS.RANGE_TOOL_START_FAILED -> Log.d("Remote Assist","RANGE_TOOL_START_FAILED")
                    RTCNRangeTool.RANGE_TOOL_STATUS.RANGE_TOOL_IS_NOT_RUNNING -> Log.d("Remote Assist","RANGE_TOOL_IS_NOT_RUNNING")
                }
            }
        }

        // Making an instace of
        val test = RangeToolHandler()

        /**
         * (1) Implementing Connection Handler Class
         * (2) Making an instance of the above
         * (3) Adding and Removing Connection Handler
         */

        // Step 1
        Log.d("Remote Assist","Connection Handler class definition")
        class ConnectionHandler :  RTCNRemoteAssist.RemoteControlConnectionHandler {
            override fun onConnected() {
                Log.d("Remote Assist","Connection Established")
            }

            override fun onConnectFailed() {
                Log.d("Remote Assist","Connection Failed")
            }

            override fun onDisconnected() {
                Log.d("Remote Assist","Disconnected")
            }
        }
        fun throwSomeError(){
            throw IllegalArgumentException("Wrong Arguments")
        }

        // Step 2
        val cntHandler = ConnectionHandler()

        try {
            // throwSomeError()
            cntHandler.onConnected()
            cntHandler.onDisconnected()
        } catch (e : Exception){
            cntHandler.onConnectFailed()
        }
        // Step 3
        remoteAssist.addRemoteControlConnectionHandler(cntHandler)
        // TODO("Perform task after connection handler")
        Log.d("Remote Assist","Remote Handler added, and will be removed")
        remoteAssist.removeRemoteControlConnectionHandler(cntHandler)

        // SUS-429
    }
}
*/

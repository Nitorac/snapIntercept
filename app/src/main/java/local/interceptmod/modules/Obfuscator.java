package local.interceptmod.modules;

interface Obfuscator {
    // Snapchat version
    int VersionCode = 1627;
    String ExpectedVersion = "10.26.5.0";
    // Snap event - everything here is in the file of SnapEventKlass
    String SnapEventKlass = "rbl"; // find the file with "-FirstFrame" in it
    String SnapEventGetCacheKey = "L"; // return L() + "-FirstFrame";
    String SnapEventIsVideo = "i"; // in the (i()) in the if statement above: return rnv.SNAP_VIDEO_RECEIVED;
    String SnapEventUsername = "aw"; //  this.aw = str2;
    String SnapEventTimestamp = "v"; // this.v = j2;
    String SnapEventIsZipped= "ax"; // "isZipped", this.ax
    // Media cache - everything here is in the file of MediaCacheEntryKlass
    String MediaCacheEntryKlass = "rgc"; // find the file with ("mCache", this.a).a("mKey", this.b) in it
    String MediaCacheEntryConstructorFirstParam = "tpb"; // public rgc(tpb tpb, String str) {this(tpb, str, null, false);}
    // Encryption
    String CbcEncryptionAlgorithmKlass = "com.snapchat.android.framework.crypto.CbcEncryptionAlgorithm";
    String CbcEncryptionAlgorithmDecrypt = "b";
    String EncryptionAlgorithmInterface = "com.snapchat.android.framework.crypto.EncryptionAlgorithm";
    // Root detection
    String RootDetectorKlass = "ssp"; // "/sbin/su", "/system/bin/su",
    String RootDetectorFirst = "b";
    String RootDetectorSecond = "c";
    String RootDetectorThird = "d";
    String RootDetectorForth = "e";
}
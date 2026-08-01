package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import ealvatag.tag.datatype.DataTypes;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490e {
    public static final int[] Signature;

    /* renamed from: abstract, reason: not valid java name */
    public static final byte[] f2556abstract;
    public static final int[] admob;
    public static final byte[] ads;
    public static final byte[] applovin;

    /* renamed from: break, reason: not valid java name */
    public static final byte[] f2557break;

    /* renamed from: class, reason: not valid java name */
    public static final int[] f2558class;
    public static final byte[] crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public static final HashMap[] f2559extends;
    public static final String[] firebase;

    /* renamed from: goto, reason: not valid java name */
    public static final C4409e f2560goto;
    public static final byte[] inmobi;

    /* renamed from: interface, reason: not valid java name */
    public static final byte[] f2561interface;
    public static final byte[] isPro;
    public static final byte[] isVip;
    public static final boolean loadAd = Log.isLoggable("ExifInterface", 3);

    /* renamed from: native, reason: not valid java name */
    public static final C4409e[] f2562native;
    public static final byte[] premium;
    public static final byte[] pro;

    /* renamed from: protected, reason: not valid java name */
    public static final Charset f2563protected;
    public static final byte[] remoteconfig;
    public static final byte[] signatures;
    public static final byte[] subs;
    public static final byte[] subscription;
    public static final byte[] tapsense;

    /* renamed from: this, reason: not valid java name */
    public static final C4409e[][] f2564this;

    /* renamed from: throw, reason: not valid java name */
    public static final HashMap[] f2565throw;

    /* renamed from: try, reason: not valid java name */
    public static final HashMap f2566try;

    /* renamed from: while, reason: not valid java name */
    public static final Set f2567while;
    public final String ad;
    public int adcel;
    public int advert;
    public C11040e amazon;
    public final boolean appmetrica;
    public final HashSet billing;
    public int license;
    public final AssetManager.AssetInputStream metrica;
    public int mopub;
    public final HashMap[] purchase;
    public int smaato;
    public boolean startapp;
    public final FileDescriptor vip;
    public ByteOrder yandex;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        Signature = new int[]{8, 8, 8};
        admob = new int[]{8};
        subscription = new byte[]{-1, -40, -1};
        remoteconfig = new byte[]{102, 116, 121, 112};
        pro = new byte[]{109, 105, 102, 49};
        signatures = new byte[]{104, 101, 105, 99};
        tapsense = new byte[]{97, 118, 105, 102};
        isVip = new byte[]{97, 118, 105, 115};
        inmobi = new byte[]{79, 76, 89, 77, 80, 0};
        isPro = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        applovin = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        ads = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        premium = new byte[]{82, 73, 70, 70};
        subs = new byte[]{87, 69, 66, 80};
        crashlytics = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        firebase = new String[]{BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f2558class = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f2561interface = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C4409e[] c4409eArr = {new C4409e("NewSubfileType", 254, 4), new C4409e("SubfileType", 255, 4), new C4409e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4, "ImageWidth"), new C4409e(257, 3, 4, "ImageLength"), new C4409e("BitsPerSample", 258, 3), new C4409e("Compression", 259, 3), new C4409e("PhotometricInterpretation", 262, 3), new C4409e("ImageDescription", 270, 2), new C4409e("Make", 271, 2), new C4409e("Model", 272, 2), new C4409e(273, 3, 4, "StripOffsets"), new C4409e("Orientation", 274, 3), new C4409e("SamplesPerPixel", 277, 3), new C4409e(278, 3, 4, "RowsPerStrip"), new C4409e(279, 3, 4, "StripByteCounts"), new C4409e("XResolution", 282, 5), new C4409e("YResolution", 283, 5), new C4409e("PlanarConfiguration", 284, 3), new C4409e("ResolutionUnit", 296, 3), new C4409e("TransferFunction", 301, 3), new C4409e("Software", 305, 2), new C4409e(DataTypes.OBJ_DATETIME, 306, 2), new C4409e("Artist", 315, 2), new C4409e("WhitePoint", 318, 5), new C4409e("PrimaryChromaticities", 319, 5), new C4409e("SubIFDPointer", 330, 4), new C4409e("JPEGInterchangeFormat", 513, 4), new C4409e("JPEGInterchangeFormatLength", 514, 4), new C4409e("YCbCrCoefficients", 529, 5), new C4409e("YCbCrSubSampling", 530, 3), new C4409e("YCbCrPositioning", 531, 3), new C4409e("ReferenceBlackWhite", 532, 5), new C4409e("Copyright", 33432, 2), new C4409e("ExifIFDPointer", 34665, 4), new C4409e("GPSInfoIFDPointer", 34853, 4), new C4409e("SensorTopBorder", 4, 4), new C4409e("SensorLeftBorder", 5, 4), new C4409e("SensorBottomBorder", 6, 4), new C4409e("SensorRightBorder", 7, 4), new C4409e("ISO", 23, 3), new C4409e("JpgFromRaw", 46, 7), new C4409e("Xmp", 700, 1)};
        C4409e[] c4409eArr2 = {new C4409e("ExposureTime", 33434, 5), new C4409e("FNumber", 33437, 5), new C4409e("ExposureProgram", 34850, 3), new C4409e("SpectralSensitivity", 34852, 2), new C4409e("PhotographicSensitivity", 34855, 3), new C4409e("OECF", 34856, 7), new C4409e("SensitivityType", 34864, 3), new C4409e("StandardOutputSensitivity", 34865, 4), new C4409e("RecommendedExposureIndex", 34866, 4), new C4409e("ISOSpeed", 34867, 4), new C4409e("ISOSpeedLatitudeyyy", 34868, 4), new C4409e("ISOSpeedLatitudezzz", 34869, 4), new C4409e("ExifVersion", 36864, 2), new C4409e("DateTimeOriginal", 36867, 2), new C4409e("DateTimeDigitized", 36868, 2), new C4409e("OffsetTime", 36880, 2), new C4409e("OffsetTimeOriginal", 36881, 2), new C4409e("OffsetTimeDigitized", 36882, 2), new C4409e("ComponentsConfiguration", 37121, 7), new C4409e("CompressedBitsPerPixel", 37122, 5), new C4409e("ShutterSpeedValue", 37377, 10), new C4409e("ApertureValue", 37378, 5), new C4409e("BrightnessValue", 37379, 10), new C4409e("ExposureBiasValue", 37380, 10), new C4409e("MaxApertureValue", 37381, 5), new C4409e("SubjectDistance", 37382, 5), new C4409e("MeteringMode", 37383, 3), new C4409e("LightSource", 37384, 3), new C4409e("Flash", 37385, 3), new C4409e("FocalLength", 37386, 5), new C4409e("SubjectArea", 37396, 3), new C4409e("MakerNote", 37500, 7), new C4409e("UserComment", 37510, 7), new C4409e("SubSecTime", 37520, 2), new C4409e("SubSecTimeOriginal", 37521, 2), new C4409e("SubSecTimeDigitized", 37522, 2), new C4409e("FlashpixVersion", 40960, 7), new C4409e("ColorSpace", 40961, 3), new C4409e(40962, 3, 4, "PixelXDimension"), new C4409e(40963, 3, 4, "PixelYDimension"), new C4409e("RelatedSoundFile", 40964, 2), new C4409e("InteroperabilityIFDPointer", 40965, 4), new C4409e("FlashEnergy", 41483, 5), new C4409e("SpatialFrequencyResponse", 41484, 7), new C4409e("FocalPlaneXResolution", 41486, 5), new C4409e("FocalPlaneYResolution", 41487, 5), new C4409e("FocalPlaneResolutionUnit", 41488, 3), new C4409e("SubjectLocation", 41492, 3), new C4409e("ExposureIndex", 41493, 5), new C4409e("SensingMethod", 41495, 3), new C4409e("FileSource", 41728, 7), new C4409e("SceneType", 41729, 7), new C4409e("CFAPattern", 41730, 7), new C4409e("CustomRendered", 41985, 3), new C4409e("ExposureMode", 41986, 3), new C4409e("WhiteBalance", 41987, 3), new C4409e("DigitalZoomRatio", 41988, 5), new C4409e("FocalLengthIn35mmFilm", 41989, 3), new C4409e("SceneCaptureType", 41990, 3), new C4409e("GainControl", 41991, 3), new C4409e("Contrast", 41992, 3), new C4409e("Saturation", 41993, 3), new C4409e("Sharpness", 41994, 3), new C4409e("DeviceSettingDescription", 41995, 7), new C4409e("SubjectDistanceRange", 41996, 3), new C4409e("ImageUniqueID", 42016, 2), new C4409e("CameraOwnerName", 42032, 2), new C4409e("BodySerialNumber", 42033, 2), new C4409e("LensSpecification", 42034, 5), new C4409e("LensMake", 42035, 2), new C4409e("LensModel", 42036, 2), new C4409e("Gamma", 42240, 5), new C4409e("DNGVersion", 50706, 1), new C4409e(50720, 3, 4, "DefaultCropSize")};
        C4409e[] c4409eArr3 = {new C4409e("GPSVersionID", 0, 1), new C4409e("GPSLatitudeRef", 1, 2), new C4409e(2, 5, 10, "GPSLatitude"), new C4409e("GPSLongitudeRef", 3, 2), new C4409e(4, 5, 10, "GPSLongitude"), new C4409e("GPSAltitudeRef", 5, 1), new C4409e("GPSAltitude", 6, 5), new C4409e("GPSTimeStamp", 7, 5), new C4409e("GPSSatellites", 8, 2), new C4409e("GPSStatus", 9, 2), new C4409e("GPSMeasureMode", 10, 2), new C4409e("GPSDOP", 11, 5), new C4409e("GPSSpeedRef", 12, 2), new C4409e("GPSSpeed", 13, 5), new C4409e("GPSTrackRef", 14, 2), new C4409e("GPSTrack", 15, 5), new C4409e("GPSImgDirectionRef", 16, 2), new C4409e("GPSImgDirection", 17, 5), new C4409e("GPSMapDatum", 18, 2), new C4409e("GPSDestLatitudeRef", 19, 2), new C4409e("GPSDestLatitude", 20, 5), new C4409e("GPSDestLongitudeRef", 21, 2), new C4409e("GPSDestLongitude", 22, 5), new C4409e("GPSDestBearingRef", 23, 2), new C4409e("GPSDestBearing", 24, 5), new C4409e("GPSDestDistanceRef", 25, 2), new C4409e("GPSDestDistance", 26, 5), new C4409e("GPSProcessingMethod", 27, 7), new C4409e("GPSAreaInformation", 28, 7), new C4409e("GPSDateStamp", 29, 2), new C4409e("GPSDifferential", 30, 3), new C4409e("GPSHPositioningError", 31, 5)};
        C4409e[] c4409eArr4 = {new C4409e("InteroperabilityIndex", 1, 2)};
        C4409e[] c4409eArr5 = {new C4409e("NewSubfileType", 254, 4), new C4409e("SubfileType", 255, 4), new C4409e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4, "ThumbnailImageWidth"), new C4409e(257, 3, 4, "ThumbnailImageLength"), new C4409e("BitsPerSample", 258, 3), new C4409e("Compression", 259, 3), new C4409e("PhotometricInterpretation", 262, 3), new C4409e("ImageDescription", 270, 2), new C4409e("Make", 271, 2), new C4409e("Model", 272, 2), new C4409e(273, 3, 4, "StripOffsets"), new C4409e("ThumbnailOrientation", 274, 3), new C4409e("SamplesPerPixel", 277, 3), new C4409e(278, 3, 4, "RowsPerStrip"), new C4409e(279, 3, 4, "StripByteCounts"), new C4409e("XResolution", 282, 5), new C4409e("YResolution", 283, 5), new C4409e("PlanarConfiguration", 284, 3), new C4409e("ResolutionUnit", 296, 3), new C4409e("TransferFunction", 301, 3), new C4409e("Software", 305, 2), new C4409e(DataTypes.OBJ_DATETIME, 306, 2), new C4409e("Artist", 315, 2), new C4409e("WhitePoint", 318, 5), new C4409e("PrimaryChromaticities", 319, 5), new C4409e("SubIFDPointer", 330, 4), new C4409e("JPEGInterchangeFormat", 513, 4), new C4409e("JPEGInterchangeFormatLength", 514, 4), new C4409e("YCbCrCoefficients", 529, 5), new C4409e("YCbCrSubSampling", 530, 3), new C4409e("YCbCrPositioning", 531, 3), new C4409e("ReferenceBlackWhite", 532, 5), new C4409e("Copyright", 33432, 2), new C4409e("ExifIFDPointer", 34665, 4), new C4409e("GPSInfoIFDPointer", 34853, 4), new C4409e("DNGVersion", 50706, 1), new C4409e(50720, 3, 4, "DefaultCropSize")};
        f2560goto = new C4409e("StripOffsets", 273, 3);
        f2564this = new C4409e[][]{c4409eArr, c4409eArr2, c4409eArr3, c4409eArr4, c4409eArr5, c4409eArr, new C4409e[]{new C4409e("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new C4409e("CameraSettingsIFDPointer", 8224, 4), new C4409e("ImageProcessingIFDPointer", 8256, 4)}, new C4409e[]{new C4409e("PreviewImageStart", 257, 4), new C4409e("PreviewImageLength", 258, 4)}, new C4409e[]{new C4409e("AspectFrame", 4371, 3)}, new C4409e[]{new C4409e("ColorSpace", 55, 3)}};
        f2562native = new C4409e[]{new C4409e("SubIFDPointer", 330, 4), new C4409e("ExifIFDPointer", 34665, 4), new C4409e("GPSInfoIFDPointer", 34853, 4), new C4409e("InteroperabilityIFDPointer", 40965, 4), new C4409e("CameraSettingsIFDPointer", 8224, 1), new C4409e("ImageProcessingIFDPointer", 8256, 1)};
        f2559extends = new HashMap[10];
        f2565throw = new HashMap[10];
        f2567while = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f2566try = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f2563protected = forName;
        f2557break = "Exif\u0000\u0000".getBytes(forName);
        f2556abstract = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C4409e[][] c4409eArr6 = f2564this;
            if (i >= c4409eArr6.length) {
                HashMap hashMap = f2566try;
                C4409e[] c4409eArr7 = f2562native;
                hashMap.put(Integer.valueOf(c4409eArr7[0].ad), 5);
                hashMap.put(Integer.valueOf(c4409eArr7[1].ad), 1);
                hashMap.put(Integer.valueOf(c4409eArr7[2].ad), 2);
                hashMap.put(Integer.valueOf(c4409eArr7[3].ad), 3);
                hashMap.put(Integer.valueOf(c4409eArr7[4].ad), 7);
                hashMap.put(Integer.valueOf(c4409eArr7[5].ad), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2559extends[i] = new HashMap();
            f2565throw[i] = new HashMap();
            for (C4409e c4409e : c4409eArr6[i]) {
                f2559extends[i].put(Integer.valueOf(c4409e.ad), c4409e);
                f2565throw[i].put(c4409e.vip, c4409e);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:6:0x0058, B:8:0x005d, B:11:0x0074, B:12:0x0082, B:18:0x0094, B:20:0x009b, B:28:0x00cc, B:32:0x00ab, B:39:0x00b9, B:42:0x00c1, B:43:0x00c5, B:44:0x00c9, B:45:0x00d6, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00f1, B:63:0x00fc), top: B:5:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0490e(java.io.InputStream r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0490e.<init>(java.io.InputStream):void");
    }

    public static ByteOrder remoteconfig(C4815e c4815e) {
        short readShort = c4815e.readShort();
        boolean z = loadAd;
        if (readShort == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final boolean Signature(HashMap hashMap) {
        C11040e c11040e = (C11040e) hashMap.get("ImageLength");
        C11040e c11040e2 = (C11040e) hashMap.get("ImageWidth");
        if (c11040e == null || c11040e2 == null) {
            return false;
        }
        return c11040e.purchase(this.yandex) <= 512 && c11040e2.purchase(this.yandex) <= 512;
    }

    public final void ad() {
        String vip = vip("DateTimeOriginal");
        HashMap[] hashMapArr = this.purchase;
        if (vip != null && vip(DataTypes.OBJ_DATETIME) == null) {
            hashMapArr[0].put(DataTypes.OBJ_DATETIME, C11040e.ad(vip));
        }
        if (vip("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C11040e.vip(0L, this.yandex));
        }
        if (vip("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C11040e.vip(0L, this.yandex));
        }
        if (vip("Orientation") == null) {
            hashMapArr[0].put("Orientation", C11040e.vip(0L, this.yandex));
        }
        if (vip("LightSource") == null) {
            hashMapArr[1].put("LightSource", C11040e.vip(0L, this.yandex));
        }
    }

    public final void adcel(C4815e c4815e) {
        boolean z = loadAd;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c4815e);
        }
        c4815e.ad(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c4815e.readFully(bArr);
        c4815e.readFully(bArr2);
        c4815e.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c4815e.ad(i - c4815e.f10261e);
        c4815e.readFully(bArr4);
        purchase(new C4815e(bArr4), i, 5);
        c4815e.ad(i3 - c4815e.f10261e);
        c4815e.f10260e = ByteOrder.BIG_ENDIAN;
        int readInt = c4815e.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c4815e.readUnsignedShort();
            int readUnsignedShort2 = c4815e.readUnsignedShort();
            if (readUnsignedShort == f2560goto.ad) {
                short readShort = c4815e.readShort();
                short readShort2 = c4815e.readShort();
                C11040e license = C11040e.license(readShort, this.yandex);
                C11040e license2 = C11040e.license(readShort2, this.yandex);
                HashMap[] hashMapArr = this.purchase;
                hashMapArr[0].put("ImageLength", license);
                hashMapArr[0].put("ImageWidth", license2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c4815e.ad(readUnsignedShort2);
        }
    }

    public final void admob(C16660e c16660e) {
        ByteOrder remoteconfig2 = remoteconfig(c16660e);
        this.yandex = remoteconfig2;
        c16660e.f10260e = remoteconfig2;
        int readUnsignedShort = c16660e.readUnsignedShort();
        int i = this.license;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c16660e.readInt();
        if (readInt < 8) {
            throw new IOException(AbstractC1786e.admob(readInt, "Invalid first Ifd offset: "));
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            c16660e.ad(i2);
        }
    }

    public final void advert(C16660e c16660e) {
        if (loadAd) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c16660e);
        }
        mopub(c16660e);
        HashMap[] hashMapArr = this.purchase;
        C11040e c11040e = (C11040e) hashMapArr[0].get("JpgFromRaw");
        if (c11040e != null) {
            purchase(new C4815e(c11040e.license), (int) c11040e.metrica, 5);
        }
        C11040e c11040e2 = (C11040e) hashMapArr[0].get("ISO");
        C11040e c11040e3 = (C11040e) hashMapArr[1].get("PhotographicSensitivity");
        if (c11040e2 == null || c11040e3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c11040e2);
    }

    public final void amazon(C4815e c4815e) {
        if (loadAd) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c4815e);
        }
        c4815e.f10260e = ByteOrder.LITTLE_ENDIAN;
        c4815e.ad(premium.length);
        int readInt = c4815e.readInt() + 8;
        byte[] bArr = subs;
        c4815e.ad(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c4815e.readFully(bArr2);
                int readInt2 = c4815e.readInt();
                int i = length + 8;
                if (Arrays.equals(crashlytics, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c4815e.readFully(bArr3);
                    byte[] bArr4 = f2557break;
                    if (AbstractC1129e.mopub(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.adcel = i;
                    pro(0, bArr3);
                    isVip(new C4815e(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c4815e.ad(readInt2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void applovin() {
        inmobi(0, 5);
        inmobi(0, 4);
        inmobi(5, 4);
        HashMap[] hashMapArr = this.purchase;
        C11040e c11040e = (C11040e) hashMapArr[1].get("PixelXDimension");
        C11040e c11040e2 = (C11040e) hashMapArr[1].get("PixelYDimension");
        if (c11040e != null && c11040e2 != null) {
            hashMapArr[0].put("ImageWidth", c11040e);
            hashMapArr[0].put("ImageLength", c11040e2);
        }
        if (hashMapArr[4].isEmpty() && Signature(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!Signature(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        tapsense("ThumbnailOrientation", 0, "Orientation");
        tapsense("ThumbnailImageLength", 0, "ImageLength");
        tapsense("ThumbnailImageWidth", 0, "ImageWidth");
        tapsense("ThumbnailOrientation", 5, "Orientation");
        tapsense("ThumbnailImageLength", 5, "ImageLength");
        tapsense("ThumbnailImageWidth", 5, "ImageWidth");
        tapsense("Orientation", 4, "ThumbnailOrientation");
        tapsense("ImageLength", 4, "ThumbnailImageLength");
        tapsense("ImageWidth", 4, "ThumbnailImageWidth");
    }

    public final void appmetrica(C16660e c16660e, int i) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C18004e(c16660e));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.purchase;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C11040e.license(Integer.parseInt(str), this.yandex));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", C11040e.license(Integer.parseInt(str3), this.yandex));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", C11040e.license(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.yandex));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c16660e.license(parseInt2);
                    byte[] bArr = new byte[6];
                    c16660e.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f2557break)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    c16660e.readFully(bArr2);
                    this.adcel = i3;
                    pro(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    c16660e.license(j);
                    byte[] bArr3 = new byte[parseInt5];
                    c16660e.readFully(bArr3);
                    this.amazon = new C11040e(j, bArr3, 1, parseInt5);
                }
                if (loadAd) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0062, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00ec, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int billing(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0490e.billing(java.io.BufferedInputStream):int");
    }

    public final void inmobi(int i, int i2) {
        HashMap[] hashMapArr = this.purchase;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z = loadAd;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C11040e c11040e = (C11040e) hashMapArr[i].get("ImageLength");
        C11040e c11040e2 = (C11040e) hashMapArr[i].get("ImageWidth");
        C11040e c11040e3 = (C11040e) hashMapArr[i2].get("ImageLength");
        C11040e c11040e4 = (C11040e) hashMapArr[i2].get("ImageWidth");
        if (c11040e == null || c11040e2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c11040e3 == null || c11040e4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int purchase = c11040e.purchase(this.yandex);
        int purchase2 = c11040e2.purchase(this.yandex);
        int purchase3 = c11040e3.purchase(this.yandex);
        int purchase4 = c11040e4.purchase(this.yandex);
        if (purchase >= purchase3 || purchase2 >= purchase4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void isPro(C16660e c16660e, int i) {
        C11040e license;
        C11040e license2;
        HashMap[] hashMapArr = this.purchase;
        C11040e c11040e = (C11040e) hashMapArr[i].get("DefaultCropSize");
        C11040e c11040e2 = (C11040e) hashMapArr[i].get("SensorTopBorder");
        C11040e c11040e3 = (C11040e) hashMapArr[i].get("SensorLeftBorder");
        C11040e c11040e4 = (C11040e) hashMapArr[i].get("SensorBottomBorder");
        C11040e c11040e5 = (C11040e) hashMapArr[i].get("SensorRightBorder");
        if (c11040e != null) {
            if (c11040e.ad == 5) {
                C8742e[] c8742eArr = (C8742e[]) c11040e.yandex(this.yandex);
                if (c8742eArr == null || c8742eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c8742eArr));
                    return;
                } else {
                    license = C11040e.metrica(new C8742e[]{c8742eArr[0]}, this.yandex);
                    license2 = C11040e.metrica(new C8742e[]{c8742eArr[1]}, this.yandex);
                }
            } else {
                int[] iArr = (int[]) c11040e.yandex(this.yandex);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                license = C11040e.license(iArr[0], this.yandex);
                license2 = C11040e.license(iArr[1], this.yandex);
            }
            hashMapArr[i].put("ImageWidth", license);
            hashMapArr[i].put("ImageLength", license2);
            return;
        }
        if (c11040e2 != null && c11040e3 != null && c11040e4 != null && c11040e5 != null) {
            int purchase = c11040e2.purchase(this.yandex);
            int purchase2 = c11040e4.purchase(this.yandex);
            int purchase3 = c11040e5.purchase(this.yandex);
            int purchase4 = c11040e3.purchase(this.yandex);
            if (purchase2 <= purchase || purchase3 <= purchase4) {
                return;
            }
            C11040e license3 = C11040e.license(purchase2 - purchase, this.yandex);
            C11040e license4 = C11040e.license(purchase3 - purchase4, this.yandex);
            hashMapArr[i].put("ImageLength", license3);
            hashMapArr[i].put("ImageWidth", license4);
            return;
        }
        C11040e c11040e6 = (C11040e) hashMapArr[i].get("ImageLength");
        C11040e c11040e7 = (C11040e) hashMapArr[i].get("ImageWidth");
        if (c11040e6 == null || c11040e7 == null) {
            C11040e c11040e8 = (C11040e) hashMapArr[i].get("JPEGInterchangeFormat");
            C11040e c11040e9 = (C11040e) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (c11040e8 == null || c11040e9 == null) {
                return;
            }
            int purchase5 = c11040e8.purchase(this.yandex);
            int purchase6 = c11040e8.purchase(this.yandex);
            c16660e.license(purchase5);
            byte[] bArr = new byte[purchase6];
            c16660e.readFully(bArr);
            purchase(new C4815e(bArr), purchase5, i);
        }
    }

    public final void isVip(C4815e c4815e) {
        C11040e c11040e;
        int purchase;
        HashMap hashMap = this.purchase[4];
        C11040e c11040e2 = (C11040e) hashMap.get("Compression");
        if (c11040e2 == null) {
            loadAd(c4815e, hashMap);
            return;
        }
        int purchase2 = c11040e2.purchase(this.yandex);
        if (purchase2 != 1) {
            if (purchase2 == 6) {
                loadAd(c4815e, hashMap);
                return;
            } else if (purchase2 != 7) {
                return;
            }
        }
        C11040e c11040e3 = (C11040e) hashMap.get("BitsPerSample");
        if (c11040e3 != null) {
            int[] iArr = (int[]) c11040e3.yandex(this.yandex);
            int[] iArr2 = Signature;
            if (Arrays.equals(iArr2, iArr) || (this.license == 3 && (c11040e = (C11040e) hashMap.get("PhotometricInterpretation")) != null && (((purchase = c11040e.purchase(this.yandex)) == 1 && Arrays.equals(iArr, admob)) || (purchase == 6 && Arrays.equals(iArr, iArr2))))) {
                C11040e c11040e4 = (C11040e) hashMap.get("StripOffsets");
                C11040e c11040e5 = (C11040e) hashMap.get("StripByteCounts");
                if (c11040e4 == null || c11040e5 == null) {
                    return;
                }
                long[] startapp = AbstractC1129e.startapp(c11040e4.yandex(this.yandex));
                long[] startapp2 = AbstractC1129e.startapp(c11040e5.yandex(this.yandex));
                if (startapp == null || startapp.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (startapp2 == null || startapp2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (startapp.length != startapp2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : startapp2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.startapp = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < startapp.length; i3++) {
                    int i4 = (int) startapp[i3];
                    int i5 = (int) startapp2[i3];
                    if (i3 < startapp.length - 1 && i4 + i5 != startapp[i3 + 1]) {
                        this.startapp = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        c4815e.ad(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            c4815e.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.startapp) {
                    long j3 = startapp[0];
                    return;
                }
                return;
            }
        }
        if (loadAd) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final C11040e license(String str) {
        C11040e c11040e;
        int i;
        C11040e c11040e2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (loadAd) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.license) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c11040e2 = this.amazon) != null)) {
            return c11040e2;
        }
        for (int i2 = 0; i2 < f2564this.length; i2++) {
            C11040e c11040e3 = (C11040e) this.purchase[i2].get(str);
            if (c11040e3 != null) {
                return c11040e3;
            }
        }
        if (!"Xmp".equals(str) || (c11040e = this.amazon) == null) {
            return null;
        }
        return c11040e;
    }

    public final void loadAd(C4815e c4815e, HashMap hashMap) {
        C11040e c11040e = (C11040e) hashMap.get("JPEGInterchangeFormat");
        C11040e c11040e2 = (C11040e) hashMap.get("JPEGInterchangeFormatLength");
        if (c11040e == null || c11040e2 == null) {
            return;
        }
        int purchase = c11040e.purchase(this.yandex);
        int purchase2 = c11040e2.purchase(this.yandex);
        if (this.license == 7) {
            purchase += this.mopub;
        }
        if (purchase > 0 && purchase2 > 0 && this.ad == null && this.metrica == null && this.vip == null) {
            c4815e.ad(purchase);
            c4815e.readFully(new byte[purchase2]);
        }
        if (loadAd) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + purchase + ", length: " + purchase2);
        }
    }

    public final int metrica(int i, String str) {
        C11040e license = license(str);
        if (license != null) {
            try {
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return license.purchase(this.yandex);
    }

    public final void mopub(C16660e c16660e) {
        admob(c16660e);
        signatures(c16660e, 0);
        isPro(c16660e, 0);
        isPro(c16660e, 5);
        isPro(c16660e, 4);
        applovin();
        if (this.license == 8) {
            HashMap[] hashMapArr = this.purchase;
            C11040e c11040e = (C11040e) hashMapArr[1].get("MakerNote");
            if (c11040e != null) {
                C16660e c16660e2 = new C16660e(c11040e.license);
                c16660e2.f10260e = this.yandex;
                c16660e2.ad(6);
                signatures(c16660e2, 9);
                C11040e c11040e2 = (C11040e) hashMapArr[9].get("ColorSpace");
                if (c11040e2 != null) {
                    hashMapArr[1].put("ColorSpace", c11040e2);
                }
            }
        }
    }

    public final void pro(int i, byte[] bArr) {
        C16660e c16660e = new C16660e(bArr);
        admob(c16660e);
        signatures(c16660e, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        r20.f10260e = r19.yandex;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b A[LOOP:0: B:9:0x0033->B:35:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(defpackage.C4815e r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0490e.purchase(eٌِؗ, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void signatures(defpackage.C16660e r36, int r37) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0490e.signatures(eٍٖۧ, int):void");
    }

    public final boolean smaato(C16660e c16660e) {
        byte[] bArr = f2557break;
        byte[] bArr2 = new byte[bArr.length];
        c16660e.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = c16660e.f10263e.read(bArr3, i, bArr3.length - i);
            if (read == -1) {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.adcel = bArr.length;
                pro(0, copyOf);
                return true;
            }
            i += read;
            c16660e.f10261e += read;
        }
    }

    public final void startapp(C4815e c4815e) {
        if (loadAd) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c4815e);
        }
        c4815e.f10260e = ByteOrder.BIG_ENDIAN;
        int i = c4815e.f10261e;
        c4815e.ad(applovin.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int readInt = c4815e.readInt();
                int readInt2 = c4815e.readInt();
                int i2 = c4815e.f10261e;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z) {
                    this.adcel = i4;
                    byte[] bArr = new byte[readInt];
                    c4815e.readFully(bArr);
                    int readInt3 = c4815e.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    pro(0, bArr);
                    applovin();
                    isVip(new C4815e(bArr));
                    z = true;
                } else if (readInt2 == 1767135348 && !z2) {
                    byte[] bArr2 = ads;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c4815e.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = c4815e.f10261e - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            c4815e.readFully(bArr4);
                            this.amazon = new C11040e(i5, bArr4, 1, i6);
                            z2 = true;
                        }
                    }
                }
                c4815e.ad(i3 - c4815e.f10261e);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void subscription() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.purchase;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder premium2 = AbstractC4653e.premium("The size of tag group[", i, "]: ");
            premium2.append(hashMapArr[i].size());
            Log.d("ExifInterface", premium2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                C11040e c11040e = (C11040e) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c11040e.toString() + ", tagValue: '" + c11040e.billing(this.yandex) + "'");
            }
            i++;
        }
    }

    public final void tapsense(String str, int i, String str2) {
        HashMap[] hashMapArr = this.purchase;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (C11040e) hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final String vip(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C11040e license = license(str);
        if (license != null) {
            int i = license.ad;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C8742e[] c8742eArr = (C8742e[]) license.yandex(this.yandex);
                if (c8742eArr == null || c8742eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c8742eArr));
                    return null;
                }
                C8742e c8742e = c8742eArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) c8742e.ad) / ((float) c8742e.vip)));
                C8742e c8742e2 = c8742eArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) c8742e2.ad) / ((float) c8742e2.vip)));
                C8742e c8742e3 = c8742eArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c8742e3.ad) / ((float) c8742e3.vip))));
            }
            if (!f2567while.contains(str)) {
                return license.billing(this.yandex);
            }
            try {
                return Double.toString(license.appmetrica(this.yandex));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void yandex(C16660e c16660e) {
        int i;
        int i2;
        mopub(c16660e);
        HashMap[] hashMapArr = this.purchase;
        C11040e c11040e = (C11040e) hashMapArr[1].get("MakerNote");
        if (c11040e != null) {
            C16660e c16660e2 = new C16660e(c11040e.license);
            c16660e2.f10260e = this.yandex;
            byte[] bArr = inmobi;
            byte[] bArr2 = new byte[bArr.length];
            c16660e2.readFully(bArr2);
            c16660e2.license(0L);
            byte[] bArr3 = isPro;
            byte[] bArr4 = new byte[bArr3.length];
            c16660e2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c16660e2.license(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c16660e2.license(12L);
            }
            signatures(c16660e2, 6);
            C11040e c11040e2 = (C11040e) hashMapArr[7].get("PreviewImageStart");
            C11040e c11040e3 = (C11040e) hashMapArr[7].get("PreviewImageLength");
            if (c11040e2 != null && c11040e3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c11040e2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c11040e3);
            }
            C11040e c11040e4 = (C11040e) hashMapArr[8].get("AspectFrame");
            if (c11040e4 != null) {
                int[] iArr = (int[]) c11040e4.yandex(this.yandex);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C11040e license = C11040e.license(i5, this.yandex);
                C11040e license2 = C11040e.license(i6, this.yandex);
                hashMapArr[0].put("ImageWidth", license);
                hashMapArr[0].put("ImageLength", license2);
            }
        }
    }
}

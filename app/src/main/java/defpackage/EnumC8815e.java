package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8815e {
    f17727e("PREVIEW"),
    f17726e("IMAGE_CAPTURE"),
    f17729e("IMAGE_ANALYSIS"),
    f17725e("VIDEO_CAPTURE"),
    f17731e("STREAM_SHARING"),
    f17730e("UNDEFINED");


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Class f17732e;

    EnumC8815e(String str) {
        this.f17732e = r2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "Preview";
        }
        if (ordinal == 1) {
            return "ImageCapture";
        }
        if (ordinal == 2) {
            return "ImageAnalysis";
        }
        if (ordinal == 3) {
            return "VideoCapture";
        }
        if (ordinal == 4) {
            return "StreamSharing";
        }
        if (ordinal == 5) {
            return "Undefined";
        }
        throw new C14803e(10);
    }
}

package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299e {
    public final int ad;

    public /* synthetic */ C0299e(int i) {
        this.ad = i;
    }

    public static final String ad(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 34) {
            return "PRIVATE";
        }
        if (i == 1144402265) {
            return "DEPTH16";
        }
        if (i == 1768253795) {
            return "DEPTH_JPEG";
        }
        if (i == 257) {
            return "DEPTH_POINT_CLOUD";
        }
        if (i == 41) {
            return "FLEX_RGB_888";
        }
        if (i == 42) {
            return "FLEX_RGBA_8888";
        }
        if (i == 1212500294) {
            return "HEIC";
        }
        if (i == 256) {
            return "JPEG";
        }
        if (i == 4101) {
            return "JPEG_R";
        }
        if (i == 16) {
            return "NV16";
        }
        if (i == 17) {
            return "NV21";
        }
        if (i == 37) {
            return "RAW10";
        }
        if (i == 38) {
            return "RAW12";
        }
        if (i == 4098) {
            return "RAW_DEPTH";
        }
        if (i == 36) {
            return "RAW_PRIVATE";
        }
        if (i == 32) {
            return "RAW_SENSOR";
        }
        if (i == 4) {
            return "RGB_565";
        }
        if (i == 842094169) {
            return "Y12";
        }
        if (i == 540422489) {
            return "Y16";
        }
        if (i == 538982489) {
            return "Y8";
        }
        if (i == 54) {
            return "YCBCR_P010";
        }
        if (i == 35) {
            return "YUV_420_888";
        }
        if (i == 39) {
            return "YUV_422_888";
        }
        if (i == 40) {
            return "YUV_444_888";
        }
        if (i == 20) {
            return "YUY2";
        }
        if (i == 842094169) {
            return "YV12";
        }
        StringBuilder sb = new StringBuilder("UNKNOWN(");
        AbstractC15211e.ad(16);
        sb.append(Integer.toString(i, 16));
        sb.append(')');
        return sb.toString();
    }

    public static String vip(int i) {
        return "StreamFormat(" + ad(i) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0299e) {
            return this.ad == ((C0299e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return vip(this.ad);
    }
}

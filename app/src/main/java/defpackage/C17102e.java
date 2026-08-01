package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17102e implements Cloneable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f33459e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f33460e;

    public C17102e(float f) {
        this.f33460e = f;
        this.f33459e = 1;
    }

    public C17102e(int i, float f) {
        this.f33460e = f;
        this.f33459e = i;
    }

    public final float ad(C2532e c2532e) {
        float sqrt;
        if (this.f33459e != 9) {
            return license(c2532e);
        }
        C1506e c1506e = (C1506e) c2532e.f6385e;
        C2359e c2359e = c1506e.billing;
        if (c2359e == null) {
            c2359e = c1506e.purchase;
        }
        float f = this.f33460e;
        if (c2359e == null) {
            return f;
        }
        float f2 = c2359e.license;
        if (f2 == c2359e.appmetrica) {
            sqrt = f * f2;
        } else {
            sqrt = f * ((float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d));
        }
        return sqrt / 100.0f;
    }

    public final float appmetrica(C2532e c2532e) {
        if (this.f33459e != 9) {
            return license(c2532e);
        }
        C1506e c1506e = (C1506e) c2532e.f6385e;
        C2359e c2359e = c1506e.billing;
        if (c2359e == null) {
            c2359e = c1506e.purchase;
        }
        float f = this.f33460e;
        return c2359e == null ? f : (f * c2359e.appmetrica) / 100.0f;
    }

    public final boolean billing() {
        return this.f33460e == 0.0f;
    }

    public final float license(C2532e c2532e) {
        float textSize;
        int m2467class = AbstractC8703e.m2467class(this.f33459e);
        float f = this.f33460e;
        switch (m2467class) {
            case 1:
                textSize = ((C1506e) c2532e.f6385e).license.getTextSize();
                break;
            case 2:
                textSize = ((C1506e) c2532e.f6385e).license.getTextSize() / 2.0f;
                break;
            case 3:
                c2532e.getClass();
                return f * 96.0f;
            case 4:
                c2532e.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                c2532e.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                c2532e.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                c2532e.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                C1506e c1506e = (C1506e) c2532e.f6385e;
                C2359e c2359e = c1506e.billing;
                if (c2359e == null) {
                    c2359e = c1506e.purchase;
                }
                if (c2359e != null) {
                    return (f * c2359e.license) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float metrica() {
        float f;
        float f2;
        int m2467class = AbstractC8703e.m2467class(this.f33459e);
        float f3 = this.f33460e;
        if (m2467class == 0) {
            return f3;
        }
        if (m2467class == 3) {
            return f3 * 96.0f;
        }
        if (m2467class == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (m2467class == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (m2467class == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (m2467class != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final boolean purchase() {
        return this.f33460e < 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f33460e));
        switch (this.f33459e) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public final float vip(C2532e c2532e, float f) {
        return this.f33459e == 9 ? (this.f33460e * f) / 100.0f : license(c2532e);
    }
}

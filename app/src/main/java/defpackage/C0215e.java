package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0215e implements InterfaceC2062e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C0215e f1461e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C6327e f1462e = new C6327e(1, 2);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String[] f1463e;

    public C0215e() {
        C6327e c6327e = f1462e;
        int i = c6327e.vip;
        int i2 = c6327e.ad;
        String[] strArr = new String[(i - i2) + 1];
        this.f1463e = strArr;
        strArr[1 - i2] = "Absolute time using MPEG [MPEG] frames as unit";
        strArr[2 - i2] = "Absolute time using milliseconds as unit";
    }

    public static C0215e ad() {
        if (f1461e == null) {
            synchronized (C0215e.class) {
                try {
                    if (f1461e == null) {
                        f1461e = new C0215e();
                    }
                } finally {
                }
            }
        }
        return f1461e;
    }

    @Override // defpackage.InterfaceC2062e
    public final String getValue(int i) {
        C6327e c6327e = f1462e;
        if (c6327e.ad(i)) {
            String str = this.f1463e[i - c6327e.ad];
            if (str != null) {
                return str;
            }
        }
        return BuildConfig.FLAVOR;
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof, reason: not valid java name */
    public final boolean mo269instanceof(int i) {
        return f1462e.ad(i);
    }
}

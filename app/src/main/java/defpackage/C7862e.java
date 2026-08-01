package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًُٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7862e {
    public static final C2076e Companion = new Object();
    public final String ad;
    public final int vip;

    public C7862e() {
        this.ad = BuildConfig.FLAVOR;
        this.vip = 0;
    }

    public /* synthetic */ C7862e(int i, int i2, String str) {
        this.ad = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) == 0) {
            this.vip = 0;
        } else {
            this.vip = i2;
        }
    }
}

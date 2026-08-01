package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17096e {
    public final long ad;
    public int adcel;
    public final C9106e appmetrica;
    public final C14789e billing;
    public final boolean license;
    public final InterfaceC0043e metrica;
    public int mopub;
    public final C3751e purchase;
    public int startapp;
    public final long vip;
    public final ArrayList yandex;

    public C17096e(long j, long j2, InterfaceC0043e interfaceC0043e, boolean z, C9106e c9106e, C3751e c3751e) {
        this.ad = j;
        this.vip = j2;
        this.metrica = interfaceC0043e;
        this.license = z;
        this.appmetrica = c9106e;
        this.purchase = c3751e;
        int i = AbstractC1643e.ad;
        this.billing = new C14789e(6);
        this.yandex = new ArrayList();
        this.startapp = -1;
        this.adcel = -1;
        this.mopub = -1;
    }

    public final int ad(int i, int i2, int i3) {
        if (i == -1) {
            int m2467class = AbstractC8703e.m2467class(AbstractC7150e.yandex(i2, i3));
            if (m2467class == 0) {
                return this.mopub - 1;
            }
            if (m2467class == 1) {
                return this.mopub;
            }
            if (m2467class != 2) {
                throw new C14803e(10);
            }
        }
        return i;
    }
}

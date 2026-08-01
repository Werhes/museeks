package defpackage;

import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3137e extends AbstractC9743e {
    public C8010e appmetrica;
    public final C1292e metrica = new C1292e();
    public final C2125e license = new C2125e();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC9743e
    public final C17750e billing(C16890e c16890e, ByteBuffer byteBuffer) {
        Object obj;
        long j;
        C8010e c8010e = this.appmetrica;
        if (c8010e == null || c16890e.f33103e != c8010e.appmetrica()) {
            C8010e c8010e2 = new C8010e(c16890e.f15301e);
            this.appmetrica = c8010e2;
            c8010e2.ad(c16890e.f15301e - c16890e.f33103e);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C1292e c1292e = this.metrica;
        c1292e.m570throw(limit, array);
        C2125e c2125e = this.license;
        c2125e.mopub(limit, array);
        c2125e.loadAd(39);
        long billing = (c2125e.billing(1) << 32) | c2125e.billing(32);
        c2125e.loadAd(20);
        int billing2 = c2125e.billing(12);
        int billing3 = c2125e.billing(8);
        c1292e.m568protected(14);
        if (billing3 == 0) {
            obj = new Object();
        } else if (billing3 == 255) {
            long subs = c1292e.subs();
            int i = billing2 - 4;
            c1292e.mopub(0, i, new byte[i]);
            obj = new C2232e(0, subs, billing);
        } else if (billing3 == 4) {
            int ads = c1292e.ads();
            ArrayList arrayList = new ArrayList(ads);
            for (int i2 = 0; i2 < ads; i2++) {
                c1292e.subs();
                boolean z = (c1292e.ads() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int ads2 = c1292e.ads();
                    boolean z2 = (ads2 & 64) != 0;
                    boolean z3 = (ads2 & 32) != 0;
                    if (z2) {
                        c1292e.subs();
                    }
                    if (!z2) {
                        int ads3 = c1292e.ads();
                        ArrayList arrayList3 = new ArrayList(ads3);
                        for (int i3 = 0; i3 < ads3; i3++) {
                            c1292e.ads();
                            c1292e.subs();
                            arrayList3.add(new C14595e(9));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        c1292e.ads();
                        c1292e.subs();
                    }
                    c1292e.m565goto();
                    c1292e.ads();
                    c1292e.ads();
                }
                C10914e c10914e = new C10914e(9);
                DesugarCollections.unmodifiableList(arrayList2);
                arrayList.add(c10914e);
            }
            obj = new Object();
            DesugarCollections.unmodifiableList(arrayList);
        } else if (billing3 == 5) {
            C8010e c8010e3 = this.appmetrica;
            c1292e.subs();
            boolean z4 = (c1292e.ads() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int ads4 = c1292e.ads();
                boolean z5 = (ads4 & 64) != 0;
                boolean z6 = (ads4 & 32) != 0;
                boolean z7 = (ads4 & 16) != 0;
                long license = (!z5 || z7) ? -9223372036854775807L : C2232e.license(billing, c1292e);
                if (!z5) {
                    int ads5 = c1292e.ads();
                    ArrayList arrayList4 = new ArrayList(ads5);
                    for (int i4 = 0; i4 < ads5; i4++) {
                        c1292e.ads();
                        c8010e3.vip(!z7 ? C2232e.license(billing, c1292e) : -9223372036854775807L);
                        arrayList4.add(new C10215e(9));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    c1292e.ads();
                    c1292e.subs();
                }
                c1292e.m565goto();
                c1292e.ads();
                c1292e.ads();
                j = license;
            }
            obj = new C2232e(j, c8010e3.vip(j), list);
        } else if (billing3 != 6) {
            obj = null;
        } else {
            C8010e c8010e4 = this.appmetrica;
            long license2 = C2232e.license(billing, c1292e);
            obj = new C2232e(2, license2, c8010e4.vip(license2));
        }
        return obj == null ? new C17750e(new InterfaceC16707e[0]) : new C17750e(obj);
    }
}

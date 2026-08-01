package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6233e {
    public final int ad;
    public final List vip;

    public C6233e() {
        this.ad = 1;
        this.vip = Collections.singletonList(null);
    }

    public /* synthetic */ C6233e(int i, List list) {
        this.ad = i;
        this.vip = list;
    }

    public C6233e(ArrayList arrayList) {
        this.ad = 0;
        this.vip = arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0036. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.InterfaceC15956e ad(int r6, defpackage.C9556e r7) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6233e.ad(int, eٌٍٚ):eٖؓۜ");
    }

    public boolean metrica(int i) {
        return (i & this.ad) != 0;
    }

    public List vip(C9556e c9556e) {
        String str;
        int i;
        List list;
        boolean metrica = metrica(32);
        List list2 = this.vip;
        if (metrica) {
            return list2;
        }
        C1292e c1292e = new C1292e((byte[]) c9556e.f18969e);
        while (c1292e.ad() > 0) {
            int ads = c1292e.ads();
            int ads2 = c1292e.vip + c1292e.ads();
            if (ads == 134) {
                ArrayList arrayList = new ArrayList();
                int ads3 = c1292e.ads() & 31;
                for (int i2 = 0; i2 < ads3; i2++) {
                    String isPro = c1292e.isPro(3, StandardCharsets.UTF_8);
                    int ads4 = c1292e.ads();
                    boolean z = (ads4 & 128) != 0;
                    if (z) {
                        i = ads4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte ads5 = (byte) c1292e.ads();
                    c1292e.m568protected(1);
                    if (z) {
                        boolean z2 = (ads5 & 64) != 0;
                        byte[] bArr = AbstractC13612e.ad;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C11445e c11445e = new C11445e();
                    c11445e.amazon = AbstractC8542e.amazon(str);
                    c11445e.license = isPro;
                    c11445e.f23019extends = i;
                    c11445e.admob = list;
                    arrayList.add(new C16975e(c11445e));
                }
                list2 = arrayList;
            }
            c1292e.m571try(ads2);
        }
        return list2;
    }
}

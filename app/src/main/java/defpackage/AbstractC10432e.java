package defpackage;

import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10432e {
    public static final C5100e ad = new C5100e(2);

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0272, code lost:
    
        if (r49.billing(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.InterfaceC12864e r38, defpackage.C8202e r39, defpackage.C0314e r40, defpackage.C16005e r41, boolean r42, defpackage.InterfaceC8642e r43, boolean r44, defpackage.C11644e r45, defpackage.InterfaceC6428e r46, defpackage.InterfaceC10260e r47, kotlin.jvm.functions.Function1 r48, defpackage.C13770e r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10432e.ad(eّۤۧ, eًۚۛ, eؑٔۤ, eٖؖۗ, boolean, eٌّؐ, boolean, eَِؚ, eؙٖ٘, eَٔؔ, kotlin.jvm.functions.Function1, eٓؕۥ, int, int):void");
    }

    public static C10988e appmetrica() {
        C11849e c11849e = new C11849e(-1, -1, 0, true);
        Parcelable.Creator<C10988e> creator = C10988e.CREATOR;
        C10988e c10988e = new C10988e(c11849e, false);
        c10988e.f21746e = false;
        return c10988e;
    }

    public static final boolean license(C0378e c0378e) {
        return c0378e.vip() == 0;
    }

    public static final int metrica(C0378e c0378e, byte b, int i, int i2) {
        if (i < 0 || i >= c0378e.vip()) {
            throw new IllegalArgumentException(String.valueOf(i).toString());
        }
        if (i > i2 || i2 > c0378e.vip()) {
            throw new IllegalArgumentException(String.valueOf(i2).toString());
        }
        int i3 = c0378e.vip;
        byte[] bArr = c0378e.ad;
        while (i < i2) {
            if (bArr[i3 + i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object vip(InterfaceC1683e interfaceC1683e, AbstractC4455e abstractC4455e) {
        if (!((AbstractC13616e) interfaceC1683e).f27022e.f27016e) {
            AbstractC14070e.metrica("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C16158e c16158e = (C16158e) AbstractC5851e.mopub(interfaceC1683e).f27593e;
        c16158e.getClass();
        return AbstractC3167e.vip(c16158e, abstractC4455e);
    }
}

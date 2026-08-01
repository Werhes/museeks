package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5878e implements InterfaceC2747e {
    public final /* synthetic */ C7911e ad;
    public final /* synthetic */ InterfaceC14388e appmetrica;
    public final /* synthetic */ InterfaceC6256e license;
    public final /* synthetic */ C0398e metrica;
    public final /* synthetic */ int purchase;
    public final /* synthetic */ Function1 vip;

    public C5878e(C7911e c7911e, Function1 function1, C0398e c0398e, InterfaceC6256e interfaceC6256e, InterfaceC14388e interfaceC14388e, int i) {
        this.ad = c7911e;
        this.vip = function1;
        this.metrica = c0398e;
        this.license = interfaceC6256e;
        this.appmetrica = interfaceC14388e;
        this.purchase = i;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        C7911e c7911e = this.ad;
        c7911e.ad.ad(interfaceC0732e.getLayoutDirection());
        C18464e c18464e = c7911e.ad.adcel;
        if (c18464e != null) {
            return AbstractC7861e.billing(c18464e.mo2750extends());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
    }

    @Override // defpackage.InterfaceC2747e
    public final /* synthetic */ int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return AbstractC5087e.admob(this, interfaceC0732e, list, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0248  */
    @Override // defpackage.InterfaceC2747e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC17242e vip(defpackage.InterfaceC13158e r30, java.util.List r31, long r32) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5878e.vip(eٍْٕ, java.util.List, long):eٗۚ");
    }
}

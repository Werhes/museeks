package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٞۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14870e implements InterfaceC17242e {
    public final boolean Signature;
    public final List ad;
    public final C8518e adcel;
    public final List admob;
    public final int advert;
    public final InterfaceC4978e amazon;
    public final EnumC17426e appmetrica;
    public final int billing;
    public final int license;
    public final InterfaceC17242e loadAd;
    public final int metrica;
    public final float mopub;
    public final InterfaceC14388e pro;
    public final int purchase;
    public final InterfaceC18435e remoteconfig;
    public final long signatures;
    public final boolean smaato;
    public final C8518e startapp;
    public final List subscription;
    public final int vip;
    public final int yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C14870e(int r24, int r25, int r26, defpackage.EnumC17426e r27, int r28, int r29, int r30, defpackage.InterfaceC4978e r31, defpackage.InterfaceC17242e r32, defpackage.InterfaceC18435e r33, defpackage.InterfaceC14388e r34, long r35) {
        /*
            r23 = this;
            r13 = 0
            r16 = 0
            eْۨٝ r1 = defpackage.C13664e.f27089e
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r14 = r31
            r15 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14870e.<init>(int, int, int, eَٗۧ, int, int, int, eؗٙۚ, eٗۚ, eۡۦ, eٓۦۣ, long):void");
    }

    public C14870e(List list, int i, int i2, int i3, EnumC17426e enumC17426e, int i4, int i5, int i6, C8518e c8518e, C8518e c8518e2, float f, int i7, boolean z, InterfaceC4978e interfaceC4978e, InterfaceC17242e interfaceC17242e, boolean z2, List list2, List list3, InterfaceC18435e interfaceC18435e, InterfaceC14388e interfaceC14388e, long j) {
        this.ad = list;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = enumC17426e;
        this.purchase = i4;
        this.billing = i5;
        this.yandex = i6;
        this.startapp = c8518e;
        this.adcel = c8518e2;
        this.mopub = f;
        this.advert = i7;
        this.smaato = z;
        this.amazon = interfaceC4978e;
        this.loadAd = interfaceC17242e;
        this.Signature = z2;
        this.admob = list2;
        this.subscription = list3;
        this.remoteconfig = interfaceC18435e;
        this.pro = interfaceC14388e;
        this.signatures = j;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        return this.loadAd.ad();
    }

    public final C14870e appmetrica(int i) {
        int i2;
        int i3 = this.vip + this.metrica;
        if (this.Signature) {
            return null;
        }
        List list = this.ad;
        if (list.isEmpty() || this.startapp == null || (i2 = this.advert - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.mopub - (i3 != 0 ? i / i3 : 0.0f);
        if (this.adcel == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        C8518e c8518e = (C8518e) AbstractC13480e.m3591interface(list);
        C8518e c8518e2 = (C8518e) AbstractC13480e.m3570break(list);
        int i4 = this.billing;
        int i5 = this.purchase;
        if (i < 0) {
            if (Math.min((c8518e.mopub + i3) - i5, (c8518e2.mopub + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - c8518e.mopub, i4 - c8518e2.mopub) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C8518e) list.get(i6)).ad(i);
        }
        List list2 = this.admob;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((C8518e) list2.get(i7)).ad(i);
        }
        List list3 = this.subscription;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((C8518e) list3.get(i8)).ad(i);
        }
        return new C14870e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, f, i2, this.smaato || i > 0, this.amazon, this.loadAd, this.Signature, this.admob, this.subscription, this.remoteconfig, this.pro, this.signatures);
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        return this.loadAd.getWidth();
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        return this.loadAd.license();
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        this.loadAd.metrica();
    }

    public final long purchase() {
        InterfaceC17242e interfaceC17242e = this.loadAd;
        return (interfaceC17242e.getWidth() << 32) | (interfaceC17242e.vip() & 4294967295L);
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        return this.loadAd.vip();
    }
}

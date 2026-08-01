package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: e٘ۧٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18159e implements InterfaceC17992e {
    public final String ad;
    public final EnumC4755e vip;
    public static final C15964e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {null, AbstractC18039e.appmetrica(2, new C8462e(20))};
    public static final Object license = AbstractC18039e.appmetrica(2, new C8462e(21));

    public AbstractC18159e(String str, EnumC4755e enumC4755e) {
        this.ad = str;
        this.vip = enumC4755e;
    }

    public /* synthetic */ AbstractC18159e(String str, EnumC4755e enumC4755e, int i) {
        this.ad = str;
        this.vip = enumC4755e;
    }

    public static final /* synthetic */ void startapp(AbstractC18159e abstractC18159e, InterfaceC11845e interfaceC11845e, InterfaceC9998e interfaceC9998e) {
        AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC11845e;
        abstractC15920e.ads(interfaceC9998e, 0, abstractC18159e.ad);
        abstractC15920e.applovin(interfaceC9998e, 1, (InterfaceC5372e) metrica[1].getValue(), abstractC18159e.vip);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Serializable yandex(defpackage.AbstractC18159e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C15397e
            if (r0 == 0) goto L13
            r0 = r7
            eِٕؓ r0 = (defpackage.C15397e) r0
            int r1 = r0.f30347e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30347e = r1
            goto L18
        L13:
            eِٕؓ r0 = new eِٕؓ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f30345e
            int r1 = r0.f30347e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            e٘ۧٝ r6 = r0.f30346e
            defpackage.AbstractC2003e.purchase(r7)
            goto L5c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            eًۛ۠ r7 = defpackage.AbstractC1831e.vip()
            eٌٟؗ r1 = r6.vip
            java.lang.String r3 = r6.ad
            r0.f30346e = r6
            r0.f30347e = r2
            eؘُٛ r2 = new eؘُٛ
            eّٚۖ r4 = defpackage.C12575e.f25220e
            java.lang.String r5 = "audio.getAudioIdsBySource"
            r2.<init>(r5, r4)
            java.lang.String r4 = "source"
            java.lang.String r1 = r1.f10176e
            r2.ad(r4, r1)
            java.lang.String r1 = "entity_id"
            r2.ad(r1, r3)
            java.lang.Object r7 = r7.license(r2, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L5c
            return r0
        L5c:
            eٍؒۢ r7 = (defpackage.AbstractC9200e) r7
            r6.getClass()
            java.lang.Object r6 = defpackage.AbstractC3425e.adcel(r7)
            eٔؓۙ r6 = (defpackage.C14475e) r6
            if (r6 == 0) goto L8e
            java.util.List r6 = r6.ad
            if (r6 == 0) goto L8e
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.AbstractC0746e.subscription(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L7c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r6.next()
            eِؕۢ r0 = (defpackage.C11515e) r0
            java.lang.String r0 = r0.ad
            r7.add(r0)
            goto L7c
        L8e:
            r7 = 0
        L8f:
            if (r7 != 0) goto L94
            eْۨٝ r6 = defpackage.C13664e.f27089e
            return r6
        L94:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18159e.yandex(e٘ۧٝ, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    @Override // defpackage.InterfaceC17992e
    public final Object license(AbstractC10731e abstractC10731e) {
        return yandex(this, abstractC10731e);
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC17992e
    public final Object vip(List list, AbstractC10731e abstractC10731e) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        return AbstractC18406e.yandex(new C13029e((String[]) Arrays.copyOf(strArr, strArr.length)), abstractC10731e);
    }
}

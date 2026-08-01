package defpackage;

import android.graphics.Rect;
import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8200e implements InterfaceC0876e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC4311e f16683e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C0092e f16684e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final HashMap f16686e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C0092e f16689e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final HashSet f16691e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final HashSet f16692e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC2881e f16693e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC2881e f16694e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HashMap f16687e = new HashMap();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final HashMap f16685e = new HashMap();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final HashMap f16690e = new HashMap();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C11606e f16688e = new C11606e(this);

    public C8200e(InterfaceC2881e interfaceC2881e, InterfaceC2881e interfaceC2881e2, HashSet hashSet, InterfaceC4311e interfaceC4311e, C12582e c12582e) {
        this.f16694e = interfaceC2881e;
        this.f16693e = interfaceC2881e2;
        this.f16683e = interfaceC4311e;
        this.f16692e = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            hashMap.put(abstractC16510e, abstractC16510e.loadAd(interfaceC2881e.subscription(), null, abstractC16510e.billing(true, interfaceC4311e)));
        }
        this.f16686e = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.f16691e = hashSet2;
        this.f16689e = new C0092e(interfaceC2881e, hashSet2);
        if (this.f16693e != null) {
            this.f16684e = new C0092e(this.f16693e, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            AbstractC16510e abstractC16510e2 = (AbstractC16510e) it2.next();
            this.f16690e.put(abstractC16510e2, Boolean.FALSE);
            this.f16685e.put(abstractC16510e2, new C6701e(interfaceC2881e, this, c12582e));
        }
    }

    public static void pro(C4753e c4753e, AbstractC5113e abstractC5113e, C11469e c11469e) {
        c4753e.appmetrica();
        try {
            AbstractC13062e.metrica();
            c4753e.vip();
            C16887e c16887e = c4753e.advert;
            Objects.requireNonNull(c16887e);
            c16887e.billing(abstractC5113e, new RunnableC10022e(c16887e, 0));
        } catch (C3720e unused) {
            InterfaceC2784e interfaceC2784e = c11469e.purchase;
            if (interfaceC2784e != null) {
                interfaceC2784e.ad(c11469e);
            }
        }
    }

    public static AbstractC5113e signatures(AbstractC16510e abstractC16510e) {
        List vip = abstractC16510e instanceof C3373e ? abstractC16510e.admob.vip() : DesugarCollections.unmodifiableList(abstractC16510e.admob.billing.ad);
        AbstractC4265e.yandex(null, vip.size() <= 1);
        if (vip.size() == 1) {
            return (AbstractC5113e) vip.get(0);
        }
        return null;
    }

    @Override // defpackage.InterfaceC0876e
    public final void Signature(AbstractC16510e abstractC16510e) {
        AbstractC13062e.metrica();
        if (inmobi(abstractC16510e)) {
            this.f16690e.put(abstractC16510e, Boolean.FALSE);
            C4753e isVip = isVip(abstractC16510e);
            AbstractC13062e.metrica();
            isVip.vip();
            isVip.advert.ad();
        }
    }

    @Override // defpackage.InterfaceC0876e
    public final void appmetrica(AbstractC16510e abstractC16510e) {
        AbstractC13062e.metrica();
        if (inmobi(abstractC16510e)) {
            return;
        }
        this.f16690e.put(abstractC16510e, Boolean.TRUE);
        AbstractC5113e signatures = signatures(abstractC16510e);
        if (signatures != null) {
            pro(isVip(abstractC16510e), signatures, abstractC16510e.admob);
        }
    }

    public final boolean inmobi(AbstractC16510e abstractC16510e) {
        Boolean bool = (Boolean) this.f16690e.get(abstractC16510e);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void isPro(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = this.f16687e;
        hashMap3.clear();
        hashMap3.putAll(hashMap);
        for (Map.Entry entry : hashMap3.entrySet()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) entry.getKey();
            C4753e c4753e = (C4753e) entry.getValue();
            abstractC16510e.crashlytics(c4753e.license);
            abstractC16510e.premium(c4753e.vip);
            C10017e vip = c4753e.billing.vip();
            Size size = (Size) hashMap2.get(abstractC16510e);
            if (size != null) {
                vip.f19785e = size;
            }
            abstractC16510e.m4159interface(vip.ad(), null);
            abstractC16510e.subscription();
        }
    }

    public final C4753e isVip(AbstractC16510e abstractC16510e) {
        C4753e c4753e = (C4753e) this.f16687e.get(abstractC16510e);
        Objects.requireNonNull(c4753e);
        return c4753e;
    }

    @Override // defpackage.InterfaceC0876e
    public final void metrica(AbstractC16510e abstractC16510e) {
        AbstractC5113e signatures;
        AbstractC13062e.metrica();
        C4753e isVip = isVip(abstractC16510e);
        if (inmobi(abstractC16510e) && (signatures = signatures(abstractC16510e)) != null) {
            pro(isVip, signatures, abstractC16510e.admob);
        }
    }

    @Override // defpackage.InterfaceC0876e
    public final void purchase(AbstractC16510e abstractC16510e) {
        AbstractC13062e.metrica();
        if (inmobi(abstractC16510e)) {
            C4753e isVip = isVip(abstractC16510e);
            AbstractC5113e signatures = signatures(abstractC16510e);
            if (signatures != null) {
                pro(isVip, signatures, abstractC16510e.admob);
                return;
            }
            AbstractC13062e.metrica();
            isVip.vip();
            isVip.advert.ad();
        }
    }

    public final C4170e remoteconfig(AbstractC16510e abstractC16510e, C0092e c0092e, InterfaceC2881e interfaceC2881e, C4753e c4753e, int i, boolean z) {
        int signatures = interfaceC2881e.vip().signatures(i);
        boolean appmetrica = AbstractC8261e.appmetrica(c4753e.vip);
        InterfaceC12438e interfaceC12438e = (InterfaceC12438e) this.f16686e.get(abstractC16510e);
        Objects.requireNonNull(interfaceC12438e);
        C0516e vip = c0092e.vip(interfaceC12438e, c4753e.license, AbstractC8261e.vip(c4753e.vip), z);
        Rect rect = vip.ad;
        Size size = vip.vip;
        int adcel = AbstractC8261e.adcel((c4753e.startapp + interfaceC2881e.vip().signatures(((InterfaceC13842e) abstractC16510e.yandex).mo1768else(0))) - signatures);
        return new C4170e(UUID.randomUUID(), abstractC16510e instanceof C9301e ? 1 : abstractC16510e instanceof C3373e ? 4 : 2, abstractC16510e instanceof C3373e ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 34, rect, AbstractC8261e.yandex(adcel, size), adcel, abstractC16510e.amazon(interfaceC2881e) ^ appmetrica);
    }

    public final HashMap tapsense(C4753e c4753e, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f16692e.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            InterfaceC12438e interfaceC12438e = (InterfaceC12438e) this.f16686e.get(abstractC16510e);
            Objects.requireNonNull(interfaceC12438e);
            Size size = this.f16689e.vip(interfaceC12438e, c4753e.license, AbstractC8261e.vip(c4753e.vip), z).metrica;
            hashMap.put(abstractC16510e, size);
            AbstractC9464e.yandex("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + abstractC16510e);
        }
        return hashMap;
    }
}

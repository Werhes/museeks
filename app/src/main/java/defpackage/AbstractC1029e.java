package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1029e extends AbstractC3317e {
    public InterfaceC4407e adcel;
    public Handler startapp;
    public final HashMap yandex = new HashMap();

    @Override // defpackage.AbstractC3317e
    public void Signature() {
        HashMap hashMap = this.yandex;
        for (C6875e c6875e : hashMap.values()) {
            AbstractC3317e abstractC3317e = c6875e.ad;
            C14963e c14963e = c6875e.metrica;
            abstractC3317e.loadAd(c6875e.vip);
            abstractC3317e.subscription(c14963e);
            abstractC3317e.admob(c14963e);
        }
        hashMap.clear();
    }

    @Override // defpackage.AbstractC3317e
    public void adcel() {
        Iterator it = this.yandex.values().iterator();
        while (it.hasNext()) {
            ((C6875e) it.next()).ad.adcel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [eُؗؑ, eؘٞؖ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eًَٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eۣؗٓ, java.lang.Object] */
    public final void inmobi(final Object obj, AbstractC3317e abstractC3317e) {
        HashMap hashMap = this.yandex;
        AbstractC2301e.billing(!hashMap.containsKey(obj));
        ?? r1 = new InterfaceC5779e() { // from class: eُؗؑ
            @Override // defpackage.InterfaceC5779e
            public final void ad(AbstractC3317e abstractC3317e2, AbstractC6690e abstractC6690e) {
                AbstractC1029e.this.isVip(obj, abstractC3317e2, abstractC6690e);
            }
        };
        C14963e c14963e = new C14963e(this, obj);
        hashMap.put(obj, new C6875e(abstractC3317e, r1, c14963e));
        Handler handler = this.startapp;
        handler.getClass();
        abstractC3317e.getClass();
        Csuper csuper = abstractC3317e.metrica;
        csuper.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) csuper.f36471e;
        ?? obj2 = new Object();
        obj2.ad = handler;
        obj2.vip = c14963e;
        copyOnWriteArrayList.add(obj2);
        Handler handler2 = this.startapp;
        handler2.getClass();
        C15683e c15683e = abstractC3317e.license;
        c15683e.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c15683e.metrica;
        ?? obj3 = new Object();
        obj3.ad = handler2;
        obj3.vip = c14963e;
        copyOnWriteArrayList2.add(obj3);
        InterfaceC4407e interfaceC4407e = this.adcel;
        C5350e c5350e = this.billing;
        c5350e.getClass();
        abstractC3317e.mopub(r1, interfaceC4407e, c5350e);
        if (this.vip.isEmpty()) {
            abstractC3317e.metrica(r1);
        }
    }

    public abstract void isVip(Object obj, AbstractC3317e abstractC3317e, AbstractC6690e abstractC6690e);

    @Override // defpackage.AbstractC3317e
    public final void license() {
        for (C6875e c6875e : this.yandex.values()) {
            c6875e.ad.metrica(c6875e.vip);
        }
    }

    public abstract C18208e pro(Object obj, C18208e c18208e);

    @Override // defpackage.AbstractC3317e
    public final void purchase() {
        for (C6875e c6875e : this.yandex.values()) {
            c6875e.ad.appmetrica(c6875e.vip);
        }
    }

    public long signatures(long j, Object obj) {
        return j;
    }

    public int tapsense(int i, Object obj) {
        return i;
    }
}

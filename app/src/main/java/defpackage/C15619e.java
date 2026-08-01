package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15619e {
    public static final C15619e vip;
    public final AtomicReference ad = new AtomicReference(new C6150e(new C11980e(17)));

    static {
        try {
            C15619e c15619e = new C15619e();
            c15619e.license(new C13780e(C0251e.class, new C15945e(10)));
            vip = c15619e;
        } catch (Exception e) {
            throw new C14803e(e, 14);
        }
    }

    public final AbstractC14783e ad(C12524e c12524e) {
        C6150e c6150e = (C6150e) this.ad.get();
        c6150e.getClass();
        C10567e c10567e = new C10567e(c12524e.getClass(), c12524e.f25074e);
        HashMap hashMap = c6150e.vip;
        if (hashMap.containsKey(c10567e)) {
            return ((C17594e) hashMap.get(c10567e)).vip.billing(c12524e);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c10567e + " available");
    }

    public final synchronized void appmetrica(C10221e c10221e) {
        C11980e c11980e = new C11980e((C6150e) this.ad.get());
        c11980e.m3297new(c10221e);
        this.ad.set(new C6150e(c11980e));
    }

    public final InterfaceC8808e billing(AbstractC14783e abstractC14783e) {
        C6150e c6150e = (C6150e) this.ad.get();
        c6150e.getClass();
        C8764e c8764e = new C8764e(abstractC14783e.getClass(), C12524e.class);
        HashMap hashMap = c6150e.ad;
        if (hashMap.containsKey(c8764e)) {
            return ((C13780e) hashMap.get(c8764e)).vip.purchase(abstractC14783e);
        }
        throw new GeneralSecurityException("No Key serializer for " + c8764e + " available");
    }

    public final synchronized void license(C13780e c13780e) {
        C11980e c11980e = new C11980e((C6150e) this.ad.get());
        c11980e.m3302super(c13780e);
        this.ad.set(new C6150e(c11980e));
    }

    public final synchronized void metrica(C17594e c17594e) {
        C11980e c11980e = new C11980e((C6150e) this.ad.get());
        c11980e.m3295final(c17594e);
        this.ad.set(new C6150e(c11980e));
    }

    public final synchronized void purchase(C13507e c13507e) {
        C11980e c11980e = new C11980e((C6150e) this.ad.get());
        c11980e.m3301strictfp(c13507e);
        this.ad.set(new C6150e(c11980e));
    }

    public final AbstractC12699e vip(C17424e c17424e) {
        C6150e c6150e = (C6150e) this.ad.get();
        c6150e.getClass();
        C10567e c10567e = new C10567e(C17424e.class, (C15768e) c17424e.f34142e);
        HashMap hashMap = c6150e.license;
        if (hashMap.containsKey(c10567e)) {
            return ((C10221e) hashMap.get(c10567e)).vip.metrica(c17424e);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + c10567e + " available");
    }

    public final InterfaceC8808e yandex(AbstractC12699e abstractC12699e) {
        C6150e c6150e = (C6150e) this.ad.get();
        c6150e.getClass();
        C8764e c8764e = new C8764e(abstractC12699e.getClass(), C17424e.class);
        HashMap hashMap = c6150e.metrica;
        if (hashMap.containsKey(c8764e)) {
            return ((C13507e) hashMap.get(c8764e)).vip.yandex(abstractC12699e);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + c8764e + " available");
    }
}

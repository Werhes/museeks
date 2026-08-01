package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٛؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6496e {
    public static final C6496e metrica = new C6496e(0);
    public final C15620e ad = new C15620e();
    public boolean vip;

    public C6496e() {
    }

    public C6496e(int i) {
        license();
        license();
    }

    public static int ad(AbstractC10814e abstractC10814e, Object obj) {
        abstractC10814e.getClass();
        C5633e.yandex(0 << 3);
        if (EnumC1699e.f4631e == null) {
            Charset charset = AbstractC12312e.ad;
        }
        EnumC2067e enumC2067e = EnumC2067e.f5368e;
        throw null;
    }

    public static final int startapp(Map.Entry entry) {
        AbstractC10814e abstractC10814e = (AbstractC10814e) entry.getKey();
        entry.getValue();
        abstractC10814e.getClass();
        throw null;
    }

    public static boolean yandex(Map.Entry entry) {
        ((AbstractC10814e) entry.getKey()).getClass();
        throw null;
    }

    public final void appmetrica(AbstractC10814e abstractC10814e, Object obj) {
        abstractC10814e.getClass();
        Charset charset = AbstractC12312e.ad;
        obj.getClass();
        EnumC1699e enumC1699e = EnumC1699e.f4631e;
        EnumC2067e enumC2067e = EnumC2067e.f5368e;
        throw null;
    }

    public final void billing(Map.Entry entry) {
        AbstractC10814e abstractC10814e = (AbstractC10814e) entry.getKey();
        entry.getValue();
        abstractC10814e.getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6496e) {
            return this.ad.equals(((C6496e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final void license() {
        if (this.vip) {
            return;
        }
        C15620e c15620e = this.ad;
        int i = c15620e.f30806e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c15620e.metrica(i2).f9571e;
            if (obj instanceof AbstractC17076e) {
                AbstractC17076e abstractC17076e = (AbstractC17076e) obj;
                abstractC17076e.getClass();
                C17792e.metrica.ad(abstractC17076e.getClass()).ad(abstractC17076e);
                abstractC17076e.billing();
            }
        }
        if (!c15620e.f30807e) {
            for (int i3 = 0; i3 < c15620e.f30806e; i3++) {
                ((AbstractC10814e) c15620e.metrica(i3).f9572e).getClass();
            }
            Iterator it = c15620e.ad().iterator();
            while (it.hasNext()) {
                ((AbstractC10814e) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        if (!c15620e.f30807e) {
            c15620e.f30805e = c15620e.f30805e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c15620e.f30805e);
            c15620e.f30809e = c15620e.f30809e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c15620e.f30809e);
            c15620e.f30807e = true;
        }
        this.vip = true;
    }

    public final Iterator metrica() {
        C15620e c15620e = this.ad;
        return c15620e.isEmpty() ? Collections.emptyIterator() : ((C10442e) c15620e.entrySet()).iterator();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean purchase() {
        /*
            r5 = this;
            eٕٝۨ r0 = r5.ad
            int r1 = r0.f30806e
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r1) goto L16
            eٍؖۜ r4 = r0.metrica(r3)
            boolean r4 = yandex(r4)
            if (r4 != 0) goto L13
            goto L30
        L13:
            int r3 = r3 + 1
            goto L6
        L16:
            java.util.Set r0 = r0.ad()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = yandex(r1)
            if (r1 != 0) goto L1e
        L30:
            return r2
        L31:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6496e.purchase():boolean");
    }

    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final C6496e clone() {
        C6496e c6496e = new C6496e();
        C15620e c15620e = this.ad;
        int i = c15620e.f30806e;
        for (int i2 = 0; i2 < i; i2++) {
            C4392e metrica2 = c15620e.metrica(i2);
            c6496e.appmetrica((AbstractC10814e) metrica2.f9572e, metrica2.f9571e);
        }
        for (Map.Entry entry : c15620e.ad()) {
            c6496e.appmetrica((AbstractC10814e) entry.getKey(), entry.getValue());
        }
        return c6496e;
    }
}

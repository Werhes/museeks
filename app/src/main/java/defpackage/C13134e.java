package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13134e extends C14137e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f26095e;

    public C13134e(int i, int i2, Function1 function1) {
        super(i, function1);
        this.f26095e = i2;
        if (i2 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC1634e.smaato("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC3820e.ad.vip(C14137e.class).mopub() + " instead").toString());
        }
    }

    @Override // defpackage.C14137e, defpackage.InterfaceC15080e
    public final Object amazon(Object obj) {
        return m3527break(obj, false);
    }

    /* renamed from: break, reason: not valid java name */
    public final Object m3527break(Object obj, boolean z) {
        Function1 function1;
        C14803e appmetrica;
        if (this.f26095e == 3) {
            Object amazon = super.amazon(obj);
            if (!(amazon instanceof C8870e) || (amazon instanceof C14395e)) {
                return amazon;
            }
            if (!z || (function1 = this.f27963e) == null || (appmetrica = AbstractC6401e.appmetrica(function1, obj, null)) == null) {
                return Unit.INSTANCE;
            }
            throw appmetrica;
        }
        Object obj2 = obj;
        InterfaceC7004e interfaceC7004e = AbstractC11295e.license;
        C0922e c0922e = (C0922e) C14137e.f27956e.get(this);
        while (true) {
            long andIncrement = C14137e.f27958e.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean ads = ads(andIncrement, false);
            int i = AbstractC11295e.vip;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c0922e.f24956e != j3) {
                C0922e ad = C14137e.ad(this, j3, c0922e);
                if (ad != null) {
                    c0922e = ad;
                } else if (ads) {
                    return new C14395e(inmobi());
                }
            }
            int purchase = C14137e.purchase(this, c0922e, i2, obj2, j, interfaceC7004e, ads);
            if (purchase == 0) {
                c0922e.vip();
                return Unit.INSTANCE;
            }
            if (purchase == 1) {
                return Unit.INSTANCE;
            }
            if (purchase == 2) {
                if (ads) {
                    c0922e.startapp();
                    return new C14395e(inmobi());
                }
                InterfaceC5634e interfaceC5634e = interfaceC7004e instanceof InterfaceC5634e ? (InterfaceC5634e) interfaceC7004e : null;
                if (interfaceC5634e != null) {
                    interfaceC5634e.metrica(c0922e, i2 + i);
                }
                admob((c0922e.f24956e * j2) + i2);
                return Unit.INSTANCE;
            }
            if (purchase == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (purchase == 4) {
                if (j < C14137e.f27953e.get(this)) {
                    c0922e.vip();
                }
                return new C14395e(inmobi());
            }
            if (purchase == 5) {
                c0922e.vip();
            }
            obj2 = obj;
        }
    }

    @Override // defpackage.C14137e
    public final boolean crashlytics() {
        return this.f26095e == 2;
    }

    @Override // defpackage.C14137e, defpackage.InterfaceC15080e
    public final Object metrica(InterfaceC5083e interfaceC5083e, Object obj) {
        C14803e appmetrica;
        if (!(m3527break(obj, true) instanceof C14395e)) {
            return Unit.INSTANCE;
        }
        Function1 function1 = this.f27963e;
        if (function1 == null || (appmetrica = AbstractC6401e.appmetrica(function1, obj, null)) == null) {
            throw inmobi();
        }
        AbstractC13362e.license(appmetrica, inmobi());
        throw appmetrica;
    }
}

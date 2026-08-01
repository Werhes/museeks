package defpackage;

import java.io.Serializable;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8209e implements InterfaceC1991e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Serializable f16700e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f16701e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile Object f16702e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16703e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.io.Serializable] */
    public C8209e(int i) {
        this.f16703e = i;
        switch (i) {
            case 2:
                this.f16701e = new Object();
                this.f16700e = AbstractC2074e.class.getName();
                return;
            default:
                C10659e c10659e = C10659e.f20989e;
                this.f16700e = new Object();
                this.f16702e = c10659e;
                return;
        }
    }

    public C8209e(Class cls) {
        this.f16703e = 0;
        this.f16701e = new Object();
        this.f16700e = cls.getName();
    }

    @Override // defpackage.InterfaceC1991e
    public Object ad() {
        InterfaceC1991e interfaceC1991e = (InterfaceC1991e) this.f16702e;
        C11993e c11993e = C11993e.f23965e;
        if (interfaceC1991e != c11993e) {
            synchronized (((C11625e) this.f16700e)) {
                try {
                    if (((InterfaceC1991e) this.f16702e) != c11993e) {
                        Object ad = ((InterfaceC1991e) this.f16702e).ad();
                        this.f16701e = ad;
                        this.f16702e = c11993e;
                        return ad;
                    }
                } finally {
                }
            }
        }
        return this.f16701e;
    }

    public Logger metrica() {
        Logger logger = (Logger) this.f16702e;
        if (logger != null) {
            return logger;
        }
        synchronized (((C11625e) this.f16701e)) {
            try {
                Logger logger2 = (Logger) this.f16702e;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f16700e);
                this.f16702e = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f16703e) {
            case 1:
                Object obj = (InterfaceC1991e) this.f16702e;
                if (obj == C11993e.f23965e) {
                    String valueOf = String.valueOf(this.f16701e);
                    obj = AbstractC8647e.ads(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
                }
                String valueOf2 = String.valueOf(obj);
                return AbstractC8647e.ads(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
            default:
                return super.toString();
        }
    }

    public Logger vip() {
        Logger logger = (Logger) this.f16702e;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f16701e) {
            try {
                Logger logger2 = (Logger) this.f16702e;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f16700e);
                this.f16702e = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

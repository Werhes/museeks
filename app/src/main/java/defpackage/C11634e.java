package defpackage;

import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11634e {
    public final Object ad;
    public final Throwable appmetrica;
    public final Object license;
    public final Function3 metrica;
    public final InterfaceC4075e vip;

    public C11634e(Object obj, InterfaceC4075e interfaceC4075e, Function3 function3, Object obj2, Throwable th) {
        this.ad = obj;
        this.vip = interfaceC4075e;
        this.metrica = function3;
        this.license = obj2;
        this.appmetrica = th;
    }

    public /* synthetic */ C11634e(Object obj, InterfaceC4075e interfaceC4075e, Function3 function3, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC4075e, (i & 4) != 0 ? null : function3, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static C11634e ad(C11634e c11634e, InterfaceC4075e interfaceC4075e, Throwable th, int i) {
        Object obj = c11634e.ad;
        if ((i & 2) != 0) {
            interfaceC4075e = c11634e.vip;
        }
        InterfaceC4075e interfaceC4075e2 = interfaceC4075e;
        Function3 function3 = c11634e.metrica;
        Object obj2 = c11634e.license;
        if ((i & 16) != 0) {
            th = c11634e.appmetrica;
        }
        return new C11634e(obj, interfaceC4075e2, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11634e)) {
            return false;
        }
        C11634e c11634e = (C11634e) obj;
        return AbstractC7890e.billing(this.ad, c11634e.ad) && AbstractC7890e.billing(this.vip, c11634e.vip) && AbstractC7890e.billing(this.metrica, c11634e.metrica) && AbstractC7890e.billing(this.license, c11634e.license) && AbstractC7890e.billing(this.appmetrica, c11634e.appmetrica);
    }

    public final int hashCode() {
        Object obj = this.ad;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC4075e interfaceC4075e = this.vip;
        int hashCode2 = (hashCode + (interfaceC4075e == null ? 0 : interfaceC4075e.hashCode())) * 31;
        Function3 function3 = this.metrica;
        int hashCode3 = (hashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.license;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.appmetrica;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.ad + ", cancelHandler=" + this.vip + ", onCancellation=" + this.metrica + ", idempotentResume=" + this.license + ", cancelCause=" + this.appmetrica + ')';
    }
}

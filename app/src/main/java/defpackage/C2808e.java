package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۘۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2808e extends CancellationException implements InterfaceC13853e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final transient InterfaceC10500e f6756e;

    public C2808e(String str, Throwable th, C6467e c6467e) {
        super(str);
        this.f6756e = c6467e;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.InterfaceC13853e
    public final /* bridge */ /* synthetic */ Throwable ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2808e)) {
            return false;
        }
        C2808e c2808e = (C2808e) obj;
        if (!AbstractC7890e.billing(c2808e.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c2808e.f6756e;
        if (obj2 == null) {
            obj2 = C1845e.f4938e;
        }
        Object obj3 = this.f6756e;
        if (obj3 == null) {
            obj3 = C1845e.f4938e;
        }
        return obj2.equals(obj3) && AbstractC7890e.billing(c2808e.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int hashCode = getMessage().hashCode() * 31;
        Object obj = this.f6756e;
        if (obj == null) {
            obj = C1845e.f4938e;
        }
        int hashCode2 = (obj.hashCode() + hashCode) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f6756e;
        if (obj == null) {
            obj = C1845e.f4938e;
        }
        sb.append(obj);
        return sb.toString();
    }
}

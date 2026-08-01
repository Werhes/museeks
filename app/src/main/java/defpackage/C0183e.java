package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0183e {
    public static final C8870e vip = new Object();
    public final Object ad;

    public static final Object ad(Object obj) {
        if (obj instanceof C8870e) {
            return null;
        }
        return obj;
    }

    public static final void vip(Object obj) {
        if (obj instanceof C8870e) {
            if (!(obj instanceof C14395e)) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
            }
            Throwable th = ((C14395e) obj).ad;
            if (th == null) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0183e) {
            return AbstractC7890e.billing(this.ad, ((C0183e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.ad;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.ad;
        if (obj instanceof C14395e) {
            return ((C14395e) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}

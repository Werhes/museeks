package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14330e implements Map.Entry, InterfaceC6514e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f28345e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f28346e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16555e f28347e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28348e = 0;

    public C14330e(C0895e c0895e, String str, Object obj) {
        this.f28347e = c0895e;
        this.f28345e = str;
        this.f28346e = obj;
    }

    public C14330e(C9673e c9673e) {
        this.f28347e = c9673e;
        this.f28346e = c9673e.f19168e.getKey();
        this.f28345e = c9673e.f19168e.getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f28348e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC7890e.billing((String) this.f28345e, entry.getKey()) && AbstractC7890e.billing(this.f28346e, entry.getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f28348e) {
            case 0:
                return (String) this.f28345e;
            default:
                return this.f28346e;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.f28348e) {
            case 0:
                return this.f28346e;
            default:
                return this.f28345e;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f28348e) {
            case 0:
                return ((String) this.f28345e).hashCode() ^ this.f28346e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.f28348e) {
            case 0:
                Object obj2 = this.f28346e;
                this.f28346e = obj;
                C0895e c0895e = (C0895e) this.f28347e;
                int ad = c0895e.ad((String) this.f28345e);
                if (ad >= 0) {
                    c0895e.f3291e[ad] = obj;
                }
                return obj2;
            default:
                C9673e c9673e = (C9673e) this.f28347e;
                if (c9673e.f19169e.metrica().license != c9673e.f19166e) {
                    throw new ConcurrentModificationException();
                }
                Object obj3 = this.f28345e;
                c9673e.f19169e.put(this.f28346e, obj);
                this.f28345e = obj;
                return obj3;
        }
    }

    public String toString() {
        switch (this.f28348e) {
            case 0:
                return ((String) this.f28345e) + '=' + this.f28346e;
            default:
                return super.toString();
        }
    }
}

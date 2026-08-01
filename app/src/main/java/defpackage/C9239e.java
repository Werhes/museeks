package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9239e implements Map.Entry, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f18438e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f18439e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18440e = 1;

    public C9239e(C8976e c8976e) {
        this.f18439e = c8976e.metrica;
        this.f18438e = c8976e.license;
    }

    public C9239e(String str, List list) {
        this.f18439e = str;
        this.f18438e = list;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f18440e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (AbstractC7890e.billing(entry.getKey(), this.f18439e) && AbstractC7890e.billing(entry.getValue(), this.f18438e)) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (AbstractC7890e.billing(entry2.getKey(), this.f18439e) && AbstractC7890e.billing(entry2.getValue(), this.f18438e)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f18440e) {
            case 0:
                return this.f18439e;
            default:
                return this.f18439e;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.f18440e) {
            case 0:
                return this.f18438e;
            default:
                return this.f18438e;
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        switch (this.f18440e) {
            case 0:
                hashCode = this.f18439e.hashCode();
                hashCode2 = this.f18438e.hashCode();
                break;
            default:
                hashCode = this.f18439e.hashCode();
                hashCode2 = this.f18438e.hashCode();
                break;
        }
        return hashCode ^ hashCode2;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        switch (this.f18440e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final String toString() {
        switch (this.f18440e) {
            case 0:
                return this.f18439e + '=' + this.f18438e;
            default:
                return this.f18439e + '=' + this.f18438e;
        }
    }
}

package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2672e implements Map.Entry, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f6545e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f6546e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6547e;

    public /* synthetic */ C2672e(Object obj, Object obj2, int i) {
        this.f6547e = i;
        this.f6546e = obj;
        this.f6545e = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f6547e) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC7890e.billing(entry.getKey(), this.f6546e) && AbstractC7890e.billing(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f6547e) {
            case 0:
                return this.f6546e;
            default:
                return this.f6546e;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f6547e) {
            case 0:
                return this.f6545e;
            default:
                return this.f6545e;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f6547e) {
            case 0:
                Object obj = this.f6546e;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f6547e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f6547e) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f6546e);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}

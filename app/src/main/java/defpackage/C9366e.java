package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9366e extends AbstractC10200e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7850e f18627e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final HashMap f18628e;

    public C9366e(C7850e c7850e) {
        super("require");
        this.f18628e = new HashMap();
        this.f18627e = c7850e;
    }

    @Override // defpackage.AbstractC10200e
    public final InterfaceC2268e ad(C11467e c11467e, List list) {
        InterfaceC2268e interfaceC2268e;
        AbstractC8677e.mopub(1, "require", list);
        String startapp = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(0)).startapp();
        HashMap hashMap = this.f18628e;
        if (hashMap.containsKey(startapp)) {
            return (InterfaceC2268e) hashMap.get(startapp);
        }
        HashMap hashMap2 = (HashMap) this.f18627e.f15896e;
        if (hashMap2.containsKey(startapp)) {
            try {
                interfaceC2268e = (InterfaceC2268e) ((Callable) hashMap2.get(startapp)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(startapp)));
            }
        } else {
            interfaceC2268e = InterfaceC2268e.f5755e;
        }
        if (interfaceC2268e instanceof AbstractC10200e) {
            hashMap.put(startapp, (AbstractC10200e) interfaceC2268e);
        }
        return interfaceC2268e;
    }
}

package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17887e extends AbstractC1075e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9892e f35123e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Map.Entry f35124e;

    public C17887e(Map.Entry entry, InterfaceC9892e interfaceC9892e) {
        super(false, 0);
        this.f35124e = entry;
        this.f35123e = interfaceC9892e;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f35124e.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.f35124e;
        return this.f35123e.license(entry.getKey(), entry.getValue());
    }
}

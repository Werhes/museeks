package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9833e extends C13615e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final HashMap f19424e = new HashMap();

    @Override // defpackage.C13615e
    public final C18091e appmetrica(Object obj) {
        return (C18091e) this.f19424e.get(obj);
    }

    @Override // defpackage.C13615e
    public final Object billing(Object obj) {
        Object billing = super.billing(obj);
        this.f19424e.remove(obj);
        return billing;
    }
}

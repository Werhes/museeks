package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11005e implements InterfaceC7227e, InterfaceC8448e, InterfaceC10269e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f21795e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f21796e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final List f21797e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC7227e f21798e;

    public C11005e(InterfaceC7227e interfaceC7227e, String str, Function1 function1, Function1 function12) {
        this.f21798e = interfaceC7227e;
        this.f21796e = str;
        this.f21795e = (List) function1.invoke(this);
        this.f21797e = (List) function12.invoke(this);
    }

    @Override // defpackage.InterfaceC7227e
    public final List ad() {
        return this.f21797e;
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean applovin(Object obj) {
        return this.f21798e.applovin(obj);
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean equals(Object obj) {
        if (obj instanceof C11005e) {
            return AbstractC7890e.billing(this.f21798e, ((C11005e) obj).f21798e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC7227e
    public final List getTypeParameters() {
        return this.f21795e;
    }

    @Override // defpackage.InterfaceC7227e
    public final int hashCode() {
        return this.f21798e.hashCode();
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: instanceof */
    public final boolean mo2269instanceof() {
        return this.f21798e.mo2269instanceof();
    }

    @Override // defpackage.InterfaceC7227e
    public final String license() {
        return this.f21796e;
    }

    @Override // defpackage.InterfaceC7227e
    public final Object loadAd() {
        return this.f21798e.loadAd();
    }

    @Override // defpackage.InterfaceC7227e
    public final String mopub() {
        return AbstractC5304e.m1871return(this.f21796e);
    }

    @Override // defpackage.InterfaceC7227e
    public final Collection premium() {
        return this.f21798e.premium();
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: private */
    public final boolean mo2270private() {
        return this.f21798e.mo2270private();
    }

    @Override // defpackage.InterfaceC7227e
    public final Collection purchase() {
        return this.f21798e.purchase();
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean subscription() {
        return this.f21798e.subscription();
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: throw */
    public final Collection mo2271throw() {
        return this.f21798e.mo2271throw();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f21798e + ')';
    }
}

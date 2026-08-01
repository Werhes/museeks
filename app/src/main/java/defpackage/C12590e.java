package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12590e extends AbstractC8761e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC8761e f25307e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC8761e f25308e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f25309e;

    public C12590e(AbstractC8761e abstractC8761e, AbstractC8761e abstractC8761e2, boolean z, Function0 function0) {
        super(function0);
        this.f25308e = abstractC8761e;
        this.f25307e = abstractC8761e2;
        this.f25309e = z;
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC13984e adcel() {
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC7227e advert() {
        return this.f25308e.advert();
    }

    @Override // defpackage.AbstractC8761e
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: class */
    public final AbstractC8761e mo2501class(boolean z) {
        AbstractC8761e mo2501class = this.f25308e.mo2501class(z);
        AbstractC8761e mo2501class2 = this.f25307e.mo2501class(z);
        return mo2501class.equals(mo2501class2) ? mo2501class : new C12590e(mo2501class, mo2501class2, this.f25309e, null);
    }

    @Override // defpackage.AbstractC8761e
    public final AbstractC8761e crashlytics() {
        return this.f25308e;
    }

    @Override // defpackage.AbstractC8761e
    public final AbstractC8761e firebase(boolean z) {
        AbstractC8761e firebase = this.f25308e.firebase(z);
        AbstractC8761e firebase2 = this.f25307e.firebase(z);
        return firebase.equals(firebase2) ? firebase : new C12590e(firebase, firebase2, this.f25309e, null);
    }

    @Override // defpackage.InterfaceC11034e
    public final List getAnnotations() {
        return this.f25308e.getAnnotations();
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: interface */
    public final AbstractC8761e mo2502interface() {
        return this.f25307e;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean isPro() {
        return this.f25309e;
    }

    @Override // defpackage.InterfaceC13984e
    public final InterfaceC0861e isVip() {
        return this.f25308e.isVip();
    }

    @Override // defpackage.InterfaceC13984e
    public final List signatures() {
        return this.f25308e.signatures();
    }

    @Override // defpackage.InterfaceC13984e
    public final boolean startapp() {
        return this.f25308e.startapp();
    }

    @Override // defpackage.AbstractC8761e
    public final boolean subs() {
        return false;
    }
}

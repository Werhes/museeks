package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11997e extends C13065e implements InterfaceC9215e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C13065e f23977e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final ArrayList f23978e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C11997e f23979e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final AbstractC2803e f23980e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final ArrayList f23981e;

    public C11997e(C11997e c11997e, AbstractC2803e abstractC2803e, boolean z, C11467e c11467e) {
        super(z, c11467e);
        this.f23979e = c11997e;
        this.f23980e = abstractC2803e;
        this.f23978e = new ArrayList();
        this.f23981e = new ArrayList();
    }

    @Override // defpackage.AbstractC4125e
    public final void ad() {
        subscription();
    }

    public final C11997e admob(AbstractC2803e abstractC2803e) {
        Object obj;
        ArrayList arrayList = this.f23978e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AbstractC7890e.billing(((C11997e) obj).f23980e, abstractC2803e)) {
                break;
            }
        }
        C11997e c11997e = (C11997e) obj;
        if (c11997e != null) {
            return c11997e;
        }
        C11997e c11997e2 = new C11997e(this, abstractC2803e, this.f25998e, this.f25997e);
        arrayList.add(c11997e2);
        return c11997e2;
    }

    public final void subscription() {
        this.f23977e = null;
        Iterator it = this.f23978e.iterator();
        while (it.hasNext()) {
            ((C11997e) it.next()).subscription();
        }
    }

    public final String toString() {
        C11997e c11997e = this.f23979e;
        String c11997e2 = c11997e != null ? c11997e.toString() : null;
        AbstractC2803e abstractC2803e = this.f23980e;
        if (c11997e2 == null) {
            if (abstractC2803e instanceof C5804e) {
                return "/";
            }
            return "/" + abstractC2803e;
        }
        if (abstractC2803e instanceof C5804e) {
            return AbstractC5304e.premium(c11997e2, '/') ? c11997e2 : c11997e2.concat("/");
        }
        if (AbstractC5304e.premium(c11997e2, '/')) {
            return c11997e2 + abstractC2803e;
        }
        return c11997e2 + '/' + abstractC2803e;
    }
}

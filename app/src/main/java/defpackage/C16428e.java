package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16428e extends AbstractC11424e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC5083e[] f32254e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C4415e f32255e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final List f32256e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f32257e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f32258e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32259e;

    public C16428e(Object obj, Object obj2, List list) {
        super(obj2);
        this.f32256e = list;
        this.f32255e = new C4415e(this);
        this.f32257e = obj;
        this.f32254e = new InterfaceC5083e[list.size()];
        this.f32259e = -1;
    }

    @Override // defpackage.AbstractC11424e
    public final Object ad(Object obj, AbstractC10731e abstractC10731e) {
        this.f32258e = 0;
        if (this.f32256e.size() == 0) {
            return obj;
        }
        this.f32257e = obj;
        if (this.f32259e < 0) {
            return appmetrica(abstractC10731e);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f32255e.admob();
    }

    @Override // defpackage.AbstractC11424e
    public final Object appmetrica(InterfaceC5083e interfaceC5083e) {
        if (this.f32258e == this.f32256e.size()) {
            return this.f32257e;
        }
        InterfaceC5083e startapp = AbstractC10558e.startapp(interfaceC5083e);
        int i = this.f32259e + 1;
        this.f32259e = i;
        InterfaceC5083e[] interfaceC5083eArr = this.f32254e;
        interfaceC5083eArr[i] = startapp;
        if (!yandex(true)) {
            return EnumC2821e.f6782e;
        }
        int i2 = this.f32259e;
        if (i2 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        this.f32259e = i2 - 1;
        interfaceC5083eArr[i2] = null;
        return this.f32257e;
    }

    @Override // defpackage.AbstractC11424e
    public final void billing(Object obj) {
        this.f32257e = obj;
    }

    @Override // defpackage.AbstractC11424e
    public final Object metrica() {
        return this.f32257e;
    }

    @Override // defpackage.AbstractC11424e
    public final Object purchase(InterfaceC5083e interfaceC5083e, Object obj) {
        this.f32257e = obj;
        return appmetrica(interfaceC5083e);
    }

    public final void startapp(Object obj) {
        int i = this.f32259e;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        InterfaceC5083e[] interfaceC5083eArr = this.f32254e;
        InterfaceC5083e interfaceC5083e = interfaceC5083eArr[i];
        this.f32259e = i - 1;
        interfaceC5083eArr[i] = null;
        if (!(obj instanceof C12763e)) {
            interfaceC5083e.billing(obj);
            return;
        }
        Throwable ad = C13523e.ad(obj);
        try {
            ad.getCause();
        } catch (Throwable unused) {
        }
        interfaceC5083e.billing(new C12763e(ad));
    }

    @Override // defpackage.AbstractC11424e
    public final void vip() {
        this.f32258e = this.f32256e.size();
    }

    public final boolean yandex(boolean z) {
        Function3 function3;
        Object obj;
        C4415e c4415e;
        do {
            int i = this.f32258e;
            List list = this.f32256e;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                startapp(this.f32257e);
                return false;
            }
            this.f32258e = i + 1;
            function3 = (Function3) list.get(i);
            try {
                obj = this.f32257e;
                c4415e = this.f32255e;
                AbstractC9476e.purchase(3, function3);
            } catch (Throwable th) {
                startapp(new C12763e(th));
                return false;
            }
        } while (function3.invoke(this, obj, c4415e) != EnumC2821e.f6782e);
        return false;
    }
}

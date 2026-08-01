package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17139e implements InterfaceC8850e, Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC4595e f33543e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f33544e;

    public C17139e(InterfaceC8850e interfaceC8850e, InterfaceC4595e interfaceC4595e) {
        this.f33544e = interfaceC8850e;
        this.f33543e = interfaceC4595e;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final /* bridge */ InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        return AbstractC5797e.vip(this, interfaceC8850e);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17139e) {
            C17139e c17139e = (C17139e) obj;
            int i = 2;
            C17139e c17139e2 = c17139e;
            int i2 = 2;
            while (true) {
                InterfaceC8850e interfaceC8850e = c17139e2.f33544e;
                c17139e2 = interfaceC8850e instanceof C17139e ? (C17139e) interfaceC8850e : null;
                if (c17139e2 == null) {
                    break;
                }
                i2++;
            }
            C17139e c17139e3 = this;
            while (true) {
                InterfaceC8850e interfaceC8850e2 = c17139e3.f33544e;
                c17139e3 = interfaceC8850e2 instanceof C17139e ? (C17139e) interfaceC8850e2 : null;
                if (c17139e3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                C17139e c17139e4 = this;
                while (true) {
                    InterfaceC4595e interfaceC4595e = c17139e4.f33543e;
                    if (!AbstractC7890e.billing(c17139e.mo397public(interfaceC4595e.getKey()), interfaceC4595e)) {
                        z = false;
                        break;
                    }
                    InterfaceC8850e interfaceC8850e3 = c17139e4.f33544e;
                    if (!(interfaceC8850e3 instanceof C17139e)) {
                        InterfaceC4595e interfaceC4595e2 = (InterfaceC4595e) interfaceC8850e3;
                        z = AbstractC7890e.billing(c17139e.mo397public(interfaceC4595e2.getKey()), interfaceC4595e2);
                        break;
                    }
                    c17139e4 = (C17139e) interfaceC8850e3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        return function2.invoke(this.f33544e.mo395e(obj, function2), this.f33543e);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        InterfaceC4595e interfaceC4595e = this.f33543e;
        InterfaceC4595e mo397public = interfaceC4595e.mo397public(interfaceC1598e);
        InterfaceC8850e interfaceC8850e = this.f33544e;
        if (mo397public != null) {
            return interfaceC8850e;
        }
        InterfaceC8850e mo396final = interfaceC8850e.mo396final(interfaceC1598e);
        return mo396final == interfaceC8850e ? this : mo396final == C2693e.f6576e ? interfaceC4595e : new C17139e(mo396final, interfaceC4595e);
    }

    public final int hashCode() {
        return this.f33543e.hashCode() + this.f33544e.hashCode();
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        C17139e c17139e = this;
        while (true) {
            InterfaceC4595e mo397public = c17139e.f33543e.mo397public(interfaceC1598e);
            if (mo397public != null) {
                return mo397public;
            }
            InterfaceC8850e interfaceC8850e = c17139e.f33544e;
            if (!(interfaceC8850e instanceof C17139e)) {
                return interfaceC8850e.mo397public(interfaceC1598e);
            }
            c17139e = (C17139e) interfaceC8850e;
        }
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("["), (String) mo395e(BuildConfig.FLAVOR, new C8171e(16)), ']');
    }
}

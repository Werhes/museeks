package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5148e extends AbstractC12141e implements InterfaceC8614e, InterfaceC8826e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final Object f11028e = new Object();

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C13475e f11029e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Object f11030e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f11031e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Object f11032e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final String f11033e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AbstractC15529e f11034e;

    public AbstractC5148e(AbstractC15529e abstractC15529e, InterfaceC2188e interfaceC2188e) {
        this(abstractC15529e, interfaceC2188e.getName().vip(), AbstractC4591e.vip(interfaceC2188e).vip(), interfaceC2188e, C11625e.f23330e);
    }

    public AbstractC5148e(AbstractC15529e abstractC15529e, String str, String str2, InterfaceC2188e interfaceC2188e, Object obj) {
        this.f11034e = abstractC15529e;
        this.f11031e = str;
        this.f11033e = str2;
        this.f11030e = obj;
        this.f11032e = AbstractC18039e.appmetrica(2, new C12515e(this, 0));
        this.f11029e = AbstractC2426e.vip(interfaceC2188e, new C12515e(this, 1));
    }

    @Override // defpackage.InterfaceC8826e
    public final InterfaceC9739e billing() {
        mo1764interface().getClass();
        return null;
    }

    @Override // defpackage.AbstractC12141e
    /* renamed from: class, reason: not valid java name and merged with bridge method [inline-methods] */
    public final InterfaceC2188e isPro() {
        return (InterfaceC2188e) this.f11029e.invoke();
    }

    public final boolean equals(Object obj) {
        AbstractC5148e abstractC5148e;
        C12816e c12816e = AbstractC5965e.ad;
        if (obj instanceof AbstractC5148e) {
            abstractC5148e = (AbstractC5148e) obj;
        } else {
            if (obj instanceof AbstractC0769e) {
                InterfaceC15954e adcel = ((AbstractC0769e) obj).adcel();
                if (adcel instanceof AbstractC5148e) {
                    abstractC5148e = (AbstractC5148e) adcel;
                }
            }
            abstractC5148e = null;
        }
        if (abstractC5148e == null) {
            return false;
        }
        return AbstractC7890e.billing(this.f11034e, abstractC5148e.f11034e) && AbstractC7890e.billing(this.f11031e, abstractC5148e.f11031e) && AbstractC7890e.billing(this.f11033e, abstractC5148e.f11033e) && AbstractC7890e.billing(this.f11030e, abstractC5148e.f11030e);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, eؕٛؓ] */
    public final Member firebase() {
        if (!isPro().mo762e()) {
            return null;
        }
        C11709e c11709e = AbstractC4591e.ad;
        AbstractC10888e vip = AbstractC4591e.vip(isPro());
        if (vip instanceof C3345e) {
            C3345e c3345e = (C3345e) vip;
            InterfaceC11824e interfaceC11824e = c3345e.appmetrica;
            C4442e c4442e = c3345e.license;
            if ((c4442e.f9640e & 16) == 16) {
                C17758e c17758e = c4442e.f9645e;
                int i = c17758e.f34834e;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.f11034e.m4000class(interfaceC11824e.getString(c17758e.f34833e), interfaceC11824e.getString(c17758e.f34835e));
            }
        }
        return (Field) this.f11032e.getValue();
    }

    @Override // defpackage.InterfaceC15954e
    public final String getName() {
        return this.f11031e;
    }

    public final int hashCode() {
        return this.f11033e.hashCode() + AbstractC1786e.advert(this.f11034e.hashCode() * 31, 31, this.f11031e);
    }

    /* renamed from: interface, reason: not valid java name */
    public abstract AbstractC1104e mo1764interface();

    @Override // defpackage.InterfaceC8826e
    public final Object pro() {
        return this.f11030e;
    }

    @Override // defpackage.InterfaceC8826e
    public final AbstractC15529e smaato() {
        return this.f11034e;
    }

    @Override // defpackage.InterfaceC15954e
    public final boolean tapsense() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C1400e.applovin(sb, this);
        sb.append(this instanceof InterfaceC3996e ? "var " : "val ");
        C1400e.premium(sb, this);
        C1400e.ads(this.f11031e, sb);
        sb.append(": ");
        sb.append(C1400e.m597class(inmobi(), false));
        return sb.toString();
    }

    @Override // defpackage.InterfaceC8826e
    public final InterfaceC9739e vip() {
        return mo1764interface().vip();
    }
}

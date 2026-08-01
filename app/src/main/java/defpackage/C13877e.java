package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13877e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f27487e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final ArrayList f27488e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f27489e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f27490e;

    public C13877e() {
        super(0);
        EnumC6916e enumC6916e;
        ArrayList arrayList = new ArrayList();
        C15937e c15937e = EnumC6916e.f14170e;
        C1630e c1630e = new C1630e(0, c15937e);
        while (c1630e.hasNext()) {
            Object next = c1630e.next();
            EnumC6916e enumC6916e2 = (EnumC6916e) next;
            if (enumC6916e2 != EnumC6916e.f14173e || AbstractC12681e.ad()) {
                if (enumC6916e2.f14175e) {
                    arrayList.add(next);
                }
            }
        }
        this.f27488e = arrayList;
        C1630e c1630e2 = new C1630e(0, c15937e);
        while (true) {
            if (!c1630e2.hasNext()) {
                enumC6916e = EnumC6916e.f14174e;
                break;
            }
            enumC6916e = (EnumC6916e) c1630e2.next();
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (AbstractC1535e.ad(vKXApplication == null ? null : vKXApplication, enumC6916e)) {
                break;
            }
        }
        C0576e startapp = AbstractC14533e.startapp(enumC6916e);
        this.f27487e = startapp;
        this.f27489e = AbstractC14533e.startapp((EnumC6916e) startapp.getValue());
        this.f27490e = AbstractC14533e.startapp(Boolean.FALSE);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static final void m3687strictfp(C13877e c13877e, EnumC6916e enumC6916e) {
        if (((Boolean) c13877e.f27490e.getValue()).booleanValue() || enumC6916e.f14178e) {
            c13877e.f27489e.setValue(enumC6916e);
        } else {
            new C9745e().signatures(c13877e.pro());
        }
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-314372935);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C9042e(this, null, 10);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            C5958e ad = AbstractC9083e.ad(c13770e);
            AbstractC13348e.ad(null, AbstractC16653e.license(374314613, new C1743e(ad, this, 10), c13770e), null, null, AbstractC16653e.license(-771045038, new C12989e(this, 0, (byte) 0), c13770e), 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1313056374, new C8937e(ad, this, 5), c13770e), c13770e, 805330992, 237);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C12989e(this, i);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final EnumC6916e m3688private() {
        return (EnumC6916e) this.f27489e.getValue();
    }
}

package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14398e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f28471e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f28472e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C5363e f28473e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f28474e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f28475e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f28476e;

    public C14398e() {
        super(0);
        this.f28473e = new C5363e(new C2841e(this, 11));
        this.f28472e = AbstractC14533e.startapp(AbstractC16524e.smaato.ad());
        this.f28475e = AbstractC14533e.startapp(AbstractC16524e.amazon.ad());
        this.f28476e = AbstractC14533e.startapp(AbstractC16524e.loadAd.ad());
        Boolean bool = Boolean.FALSE;
        this.f28471e = AbstractC14533e.startapp(bool);
        this.f28474e = AbstractC14533e.startapp(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte, boolean] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        int i2;
        List startapp;
        C5958e c5958e;
        C0764e c0764e;
        ?? r1;
        C5170e c5170e;
        C13770e c13770e2;
        C0764e c0764e2;
        C13770e c13770e3;
        C13770e c13770e4 = c13770e;
        c13770e4.m3671package(1663329021);
        int i3 = 2;
        int i4 = i | (c13770e4.yandex(this) ? 4 : 2);
        byte b = 0;
        int i5 = 1;
        if (c13770e4.m3673protected(i4 & 1, (i4 & 3) != 2)) {
            C5958e ad = AbstractC9083e.ad(c13770e4);
            InterfaceC8018e interfaceC8018e = (InterfaceC8018e) this.f28473e.getValue();
            Object m3681throw = c13770e4.m3681throw();
            C5170e c5170e2 = C2987e.ad;
            if (m3681throw == c5170e2) {
                m3681throw = new C14099e(25);
                c13770e4.m3682throws(m3681throw);
            }
            Function1 function1 = (Function1) m3681throw;
            Object m3681throw2 = c13770e4.m3681throw();
            int i6 = 3;
            if (m3681throw2 == c5170e2) {
                m3681throw2 = new C11864e(i6, b, (InterfaceC5083e) null);
                c13770e4.m3682throws(m3681throw2);
            }
            C1158e c1158e = C1158e.f3743e;
            C0764e purchase = AbstractC16982e.purchase(interfaceC8018e, function1, (Function3) m3681throw2, C1158e.yandex(), c13770e4, 48);
            C0576e c0576e = this.f28475e;
            boolean license = c13770e4.license(((EnumC9702e) c0576e.getValue()).ordinal());
            Object m3681throw3 = c13770e4.m3681throw();
            int i7 = 12;
            if (license || m3681throw3 == c5170e2) {
                int ordinal = ((EnumC9702e) c0576e.getValue()).ordinal();
                if (ordinal == 0) {
                    startapp = AbstractC6874e.startapp(new C3138e(R.drawable.ic_headphones_wave_outline_28, R.string.eq3_section_equalizer, R.string.eq3_section_equalizer_description, new C2841e(this, b), new C14099e(27)), new C3138e(R.drawable.ic_wrench_outline_28, R.string.eq3_section_compressor, R.string.eq3_section_compressor_description, new C2841e(this, 15), new C14099e(28)), new C3138e(R.drawable.ic_sound_wave_slash_outline_28, R.string.eq3_section_limiter, R.string.eq3_section_limiter_description, new C2841e(this, 16), new C14099e(29)), new C3138e(R.drawable.ic_volume_outline_28, R.string.eq3_section_balancer, R.string.eq3_section_balancer_description, new C2841e(this, i5), new C14099e(22)), new C3138e(R.drawable.ic_add_square_outline_28, R.string.eq3_section_legacy_bass_boost, R.string.eq3_section_legacy_bass_boost_description, new C2841e(this, i3), new C14099e(23)), new C3138e(R.drawable.ic_add_square_outline_28, R.string.eq3_section_legacy_preset_reverb, R.string.eq3_section_legacy_preset_reverb_description, new C2841e(this, 6), new C14099e(24)));
                } else {
                    if (ordinal != 1) {
                        throw new C14803e(10);
                    }
                    startapp = Collections.singletonList(new C3138e(R.drawable.ic_link_outline_28, R.string.eq3_section_system, R.string.eq3_section_system_description, new C2841e(this, i7), new C14099e(26)));
                }
                m3681throw3 = startapp;
                c13770e4.m3682throws(m3681throw3);
            }
            List list = (List) m3681throw3;
            int i8 = 13;
            if (((Boolean) this.f28471e.getValue()).booleanValue()) {
                c13770e4.m3676strictfp(1197764094);
                boolean yandex = c13770e4.yandex(this);
                Object m3681throw4 = c13770e4.m3681throw();
                if (yandex || m3681throw4 == c5170e2) {
                    m3681throw4 = new C2841e(this, i8);
                    c13770e4.m3682throws(m3681throw4);
                }
                c5958e = ad;
                c5170e = c5170e2;
                r1 = 0;
                c0764e = purchase;
                AbstractC9262e.ad((Function0) m3681throw4, AbstractC16653e.license(1931127184, new C9109e(this, i3, b), c13770e4), null, AbstractC16653e.license(-264101682, new C9109e(this, i6, b), c13770e4), null, AbstractC9164e.metrica, AbstractC9164e.license, null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1772592, 0, 16276);
                c13770e2 = c13770e;
            } else {
                c5958e = ad;
                c0764e = purchase;
                r1 = 0;
                c5170e = c5170e2;
                c13770e4.m3676strictfp(1192005317);
                c13770e2 = c13770e4;
            }
            c13770e2.Signature(r1);
            if (((Boolean) this.f28474e.getValue()).booleanValue()) {
                c13770e2.m3676strictfp(1198781018);
                boolean yandex2 = c13770e2.yandex(this);
                Object m3681throw5 = c13770e2.m3681throw();
                if (yandex2 || m3681throw5 == c5170e) {
                    m3681throw5 = new C2841e(this, 14);
                    c13770e2.m3682throws(m3681throw5);
                }
                C0764e c0764e3 = c0764e;
                c0764e2 = c0764e3;
                AbstractC9262e.ad((Function0) m3681throw5, AbstractC16653e.license(-1017733497, new C9109e(this, 4, r1), c13770e2), null, AbstractC16653e.license(-1803731387, new C6949e(this, c0764e3, 12), c13770e2), null, AbstractC9164e.billing, AbstractC9164e.yandex, null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1772592, 0, 16276);
                c13770e3 = c13770e;
            } else {
                c0764e2 = c0764e;
                c13770e2.m3676strictfp(1192005317);
                c13770e3 = c13770e2;
            }
            c13770e3.Signature(r1);
            C5958e c5958e2 = c5958e;
            i2 = i;
            AbstractC13348e.ad(null, AbstractC16653e.license(1649326017, new C6949e(c5958e2, this, 13), c13770e3), null, null, null, 0, 0L, 0L, ((C0916e) c13770e3.adcel(AbstractC12450e.ad)).license(c13770e3), AbstractC16653e.license(1725535884, new C12050e(c5958e2, this, list, c0764e2, 0), c13770e3), c13770e, 805306416, 253);
        } else {
            i2 = i;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9109e(this, i2);
        }
    }

    /* renamed from: package, reason: not valid java name */
    public final void m3792package(EnumC9702e enumC9702e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-1894096974);
        int i2 = (c13770e.license(enumC9702e.ordinal()) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            AbstractC7260e.metrica(interfaceC12864e, 0.0f, AbstractC16653e.license(211390215, new C8937e(enumC9702e, this, 27), c13770e), c13770e, ((i2 >> 3) & 14) | 384);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(this, enumC9702e, interfaceC12864e, i, 1);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m3793private(final int i, final int i2, final int i3, final boolean z, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i4) {
        c13770e.m3671package(1956729039);
        int i5 = i4 | (c13770e.license(i) ? 4 : 2) | (c13770e.license(i2) ? 32 : 16) | (c13770e.license(i3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(interfaceC12864e) ? 16384 : 8192);
        byte b = 0;
        if (c13770e.m3673protected(i5 & 1, (i5 & 8339) != 8338)) {
            float f = AbstractC11992e.ad;
            AbstractC16429e.ad(AbstractC16653e.license(-1724606415, new C2172e(i2, 3, b), c13770e), interfaceC12864e, null, AbstractC16653e.license(-815944242, new C2172e(i3, 4, b), c13770e), AbstractC16653e.license(-513056851, new C2172e(i, 5, b), c13770e), null, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510), 0.0f, 0.0f, c13770e, ((i5 >> 9) & 112) | 27654, 420);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(i, i2, i3, z, interfaceC12864e, i4) { // from class: eؚّٛ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f24714e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ int f24715e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ int f24716e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ int f24717e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f24719e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(1);
                    C14398e.this.m3793private(this.f24716e, this.f24715e, this.f24717e, this.f24714e, this.f24719e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3794strictfp(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(446617176);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            AbstractC15077e.vip(AbstractC9164e.amazon, AbstractC9164e.loadAd, interfaceC12864e, c13770e, 438);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(this, interfaceC12864e, i, 11);
        }
    }
}

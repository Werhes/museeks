package defpackage;

import java.util.Arrays;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16795e {
    public static final C0269e ad;
    public static final C1839e license;
    public static final C0269e metrica;
    public static final C0269e vip;

    static {
        C10761e vip2 = AbstractC12176e.vip(R.font.vk_sans_text_light, C1812e.f4886e);
        C1812e c1812e = C1812e.f4893e;
        C10761e vip3 = AbstractC12176e.vip(R.font.vk_sans_text_regular, c1812e);
        C1812e c1812e2 = C1812e.f4892e;
        C10761e vip4 = AbstractC12176e.vip(R.font.vk_sans_text_medium, c1812e2);
        C1812e c1812e3 = C1812e.f4889e;
        C10761e vip5 = AbstractC12176e.vip(R.font.vk_sans_text_demibold, c1812e3);
        C1812e c1812e4 = C1812e.f4891e;
        ad = new C0269e(Arrays.asList(vip2, vip3, vip4, vip5, AbstractC12176e.vip(R.font.vk_sans_text_bold, c1812e4)));
        C0269e c0269e = new C0269e(Arrays.asList(AbstractC12176e.vip(R.font.vk_sans_display_regular, c1812e), AbstractC12176e.vip(R.font.vk_sans_display_medium, c1812e2), AbstractC12176e.vip(R.font.vk_sans_display_demibold, c1812e3), AbstractC12176e.vip(R.font.vk_sans_display_bold, c1812e4)));
        vip = c0269e;
        metrica = new C0269e(Arrays.asList(AbstractC12176e.vip(R.font.vk_sans_display_condensed_demibold, c1812e3)));
        license = new C1839e(0L, 0L, c1812e3, c0269e, 0L, 0L, 0, 0, 0L, 16777179);
    }
}

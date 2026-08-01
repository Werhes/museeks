package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2792e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ View f6722e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11986e f6723e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10743e f6724e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f6725e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ List f6726e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f6727e;

    public C2792e(List list, C10743e c10743e, C11986e c11986e, InterfaceC18435e interfaceC18435e, View view, InterfaceC16132e interfaceC16132e) {
        this.f6726e = list;
        this.f6724e = c10743e;
        this.f6723e = c11986e;
        this.f6725e = interfaceC18435e;
        this.f6722e = view;
        this.f6727e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C6571e c6571e;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C8874e c8874e = (C8874e) this.f6726e.get(intValue);
            c13770e.m3676strictfp(-531858454);
            int ordinal = c8874e.f17829e.ordinal();
            if (ordinal == 0) {
                c6571e = new C6571e(Integer.valueOf(R.string.settings_integrations_lyrics_provider_vk), Integer.valueOf(R.string.settings_integrations_lyrics_provider_vk_description));
            } else if (ordinal == 1) {
                c6571e = new C6571e(Integer.valueOf(R.string.settings_integrations_lyrics_provider_genius), Integer.valueOf(R.string.settings_integrations_lyrics_provider_genius_description));
            } else if (ordinal == 2) {
                c6571e = new C6571e(Integer.valueOf(R.string.settings_integrations_lyrics_provider_musixmatch), Integer.valueOf(R.string.settings_integrations_lyrics_provider_musixmatch_description));
            } else {
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
                c6571e = new C6571e(Integer.valueOf(R.string.settings_integrations_lyrics_provider_lrclib), Integer.valueOf(R.string.settings_integrations_lyrics_provider_lrclib_description));
            }
            int intValue3 = ((Number) c6571e.f13544e).intValue();
            int intValue4 = ((Number) c6571e.f13543e).intValue();
            AbstractC7763e.vip(c18055e, this.f6724e, c8874e.f17829e.name(), null, true, null, AbstractC16653e.license(-1392719179, new C6706e(c8874e, c18055e, this.f6723e, intValue3, this.f6725e, intValue4, this.f6722e, this.f6727e), c13770e), c13770e, (i & 14) | 1597440, 20);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}

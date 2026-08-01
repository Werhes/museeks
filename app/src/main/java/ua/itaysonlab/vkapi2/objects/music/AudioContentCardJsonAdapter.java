package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C13664e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import defpackage.EnumC15939e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioContentCardJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("editor_annotation", "editor_background_image", "editor_gradient_image", "editor_tag", "entity_id", "entity_owner_id", "entity_type");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioContentCardJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "editorAnnotation");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "editorBackgroundImage");
        this.license = c14172e.vip(String.class, c3295e, "entityId");
        this.appmetrica = c14172e.vip(EnumC15939e.class, c3295e, "entityType");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioContentCard audioContentCard = (AudioContentCard) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("editor_annotation");
        String str = audioContentCard.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("editor_background_image");
        List list = audioContentCard.vip;
        AbstractC13345e abstractC13345e2 = this.metrica;
        abstractC13345e2.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("editor_gradient_image");
        abstractC13345e2.purchase(abstractC3442e, audioContentCard.metrica);
        abstractC3442e.loadAd("editor_tag");
        abstractC13345e.purchase(abstractC3442e, audioContentCard.license);
        abstractC3442e.loadAd("entity_id");
        String str2 = audioContentCard.appmetrica;
        AbstractC13345e abstractC13345e3 = this.license;
        abstractC13345e3.purchase(abstractC3442e, str2);
        abstractC3442e.loadAd("entity_owner_id");
        abstractC13345e3.purchase(abstractC3442e, audioContentCard.purchase);
        abstractC3442e.loadAd("entity_type");
        this.appmetrica.purchase(abstractC3442e, audioContentCard.billing);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioContentCard)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0044. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        Object obj;
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        String str = null;
        String str2 = null;
        EnumC15939e enumC15939e = null;
        Object obj5 = null;
        while (true) {
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            Object obj6 = obj2;
            if (!abstractC17080e.Signature()) {
                Object obj7 = obj3;
                Object obj8 = obj4;
                String str3 = str;
                abstractC17080e.advert();
                if ((!z4) & (str3 == null)) {
                    set = AbstractC0869e.isPro("entityId", "entity_id", abstractC17080e, set);
                }
                if ((!z5) & (str2 == null)) {
                    set = AbstractC0869e.isPro("entityOwnerId", "entity_owner_id", abstractC17080e, set);
                }
                if ((!z6) & (enumC15939e == null)) {
                    set = AbstractC0869e.isPro("entityType", "entity_type", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i == -16) {
                    return new AudioContentCard((String) obj6, (List) obj7, (List) obj8, (String) obj5, str3, str2, enumC15939e);
                }
                List list = (List) obj7;
                List list2 = (List) obj8;
                String str4 = (String) obj5;
                String str5 = (i & 1) != 0 ? null : (String) obj6;
                int i2 = i & 2;
                C13664e c13664e = C13664e.f27089e;
                return new AudioContentCard(str5, i2 != 0 ? c13664e : list, (i & 4) != 0 ? c13664e : list2, (i & 8) != 0 ? null : str4, str3, str2, enumC15939e);
            }
            Object obj9 = obj3;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.metrica;
            Object obj10 = obj4;
            AbstractC13345e abstractC13345e2 = this.vip;
            String str6 = str;
            AbstractC13345e abstractC13345e3 = this.license;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    obj3 = obj9;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    obj = obj6;
                    obj4 = obj10;
                    obj2 = obj;
                    str = str6;
                    break;
                case 0:
                    i &= -2;
                    obj3 = obj9;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    obj = abstractC13345e2.vip(abstractC17080e);
                    obj4 = obj10;
                    obj2 = obj;
                    str = str6;
                    break;
                case 1:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("editorBackgroundImage", "editor_background_image", abstractC17080e, set);
                        obj3 = obj9;
                    } else {
                        obj3 = vip;
                    }
                    i &= -3;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    obj = obj6;
                    obj4 = obj10;
                    obj2 = obj;
                    str = str6;
                    break;
                case 2:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("editorGradientImage", "editor_gradient_image", abstractC17080e, set);
                        obj4 = obj10;
                    } else {
                        obj4 = vip2;
                    }
                    i &= -5;
                    obj3 = obj9;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    obj2 = obj6;
                    str = str6;
                    break;
                case 3:
                    obj5 = abstractC13345e2.vip(abstractC17080e);
                    i &= -9;
                    obj3 = obj9;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    obj = obj6;
                    obj4 = obj10;
                    obj2 = obj;
                    str = str6;
                    break;
                case 4:
                    Object vip3 = abstractC13345e3.vip(abstractC17080e);
                    if (vip3 != null) {
                        str = (String) vip3;
                        obj3 = obj9;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        obj2 = obj6;
                        obj4 = obj10;
                        break;
                    } else {
                        set = AbstractC0869e.subs("entityId", "entity_id", abstractC17080e, set);
                        obj3 = obj9;
                        z2 = z5;
                        z3 = z6;
                        obj = obj6;
                        z = true;
                        obj4 = obj10;
                        obj2 = obj;
                        str = str6;
                        break;
                    }
                case 5:
                    Object vip4 = abstractC13345e3.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("entityOwnerId", "entity_owner_id", abstractC17080e, set);
                        obj3 = obj9;
                        z = z4;
                        z3 = z6;
                        obj = obj6;
                        z2 = true;
                        obj4 = obj10;
                        obj2 = obj;
                        str = str6;
                        break;
                    } else {
                        str2 = (String) vip4;
                        obj3 = obj9;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        obj = obj6;
                        obj4 = obj10;
                        obj2 = obj;
                        str = str6;
                    }
                case 6:
                    Object vip5 = this.appmetrica.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("entityType", "entity_type", abstractC17080e, set);
                        obj3 = obj9;
                        z = z4;
                        z2 = z5;
                        obj = obj6;
                        z3 = true;
                        obj4 = obj10;
                        obj2 = obj;
                        str = str6;
                        break;
                    } else {
                        enumC15939e = (EnumC15939e) vip5;
                        obj3 = obj9;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        obj = obj6;
                        obj4 = obj10;
                        obj2 = obj;
                        str = str6;
                    }
                default:
                    obj3 = obj9;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    obj = obj6;
                    obj4 = obj10;
                    obj2 = obj;
                    str = str6;
                    break;
            }
        }
    }
}

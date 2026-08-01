package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8407e extends AbstractC11854e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final void ad(boolean z, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        ?? r3;
        c13770e.m3671package(2099181304);
        int i2 = (c13770e.yandex(function0) ? 32 : 16) | i | (c13770e.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                Object invoke = function0.invoke();
                Catalog2Block.LinksBlock linksBlock = invoke instanceof Catalog2Block.LinksBlock ? (Catalog2Block.LinksBlock) invoke : null;
                if (linksBlock != null) {
                    LinkedHashMap linkedHashMap = ((C3675e) function02.invoke()).appmetrica;
                    List appmetrica = linksBlock.appmetrica();
                    r3 = new ArrayList();
                    Iterator it = appmetrica.iterator();
                    while (it.hasNext()) {
                        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) linkedHashMap.get((String) it.next());
                        if (customCatalogBlockItem != null) {
                            r3.add(customCatalogBlockItem);
                        }
                    }
                } else {
                    r3 = C13664e.f27089e;
                }
                m3681throw = AbstractC8228e.license(r3);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC11110e abstractC11110e = (AbstractC11110e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C17187e(23);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC4465e.ad(abstractC11110e, z, (Function1) m3681throw2, c13770e, 440);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(this, z, function0, function02, i, 5);
        }
    }
}

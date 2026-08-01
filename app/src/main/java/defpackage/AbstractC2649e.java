package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2649e extends AbstractC6649e implements Serializable {
    public static C4790e billing(AbstractC6649e abstractC6649e, AbstractC6649e abstractC6649e2, int i, EnumC0337e enumC0337e, Class cls) {
        return new C4790e(abstractC6649e, Collections.EMPTY_LIST, abstractC6649e2, new C1808e(i, enumC0337e, true), cls);
    }

    public static C4790e yandex(AbstractC6649e abstractC6649e, Object obj, AbstractC6649e abstractC6649e2, int i, EnumC0337e enumC0337e, Class cls) {
        return new C4790e(abstractC6649e, obj, abstractC6649e2, new C1808e(i, enumC0337e, false), cls);
    }
}

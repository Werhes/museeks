package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17745e extends AbstractC13958e implements InterfaceC16083e {
    public final Object[] vip;

    public C17745e(C0520e c0520e, Object[] objArr) {
        super(c0520e);
        this.vip = objArr;
    }

    public final ArrayList ad() {
        Object[] objArr = this.vip;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Class<?> cls = obj.getClass();
            List list = AbstractC2677e.ad;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C16910e(null, (Enum) obj) : obj instanceof Annotation ? new C15026e(null, (Annotation) obj) : obj instanceof Object[] ? new C17745e(null, (Object[]) obj) : obj instanceof Class ? new C17255e(null, (Class) obj) : new C4451e(null, obj));
        }
        return arrayList;
    }
}

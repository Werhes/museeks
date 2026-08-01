package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۤ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7581e extends AbstractC4003e {
    public final /* synthetic */ int appmetrica;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7581e(Member member, Type type, Class cls, Type[] typeArr, int i) {
        super(member, type, cls, typeArr);
        this.appmetrica = i;
    }

    @Override // defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        switch (this.appmetrica) {
            case 0:
                appmetrica(objArr);
                Constructor constructor = (Constructor) this.ad;
                C6325e c6325e = new C6325e(2);
                c6325e.subs(objArr);
                c6325e.premium(null);
                ArrayList arrayList = (ArrayList) c6325e.f13170e;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                appmetrica(objArr);
                return ((Constructor) this.ad).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}

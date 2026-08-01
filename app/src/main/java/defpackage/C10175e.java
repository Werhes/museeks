package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10175e implements InterfaceC7970e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C10175e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC7970e
    public final Object get() {
        switch (this.ad) {
            case 0:
                String str = (String) this.vip;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(AbstractC5087e.m1746extends("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(AbstractC5087e.m1746extends("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(AbstractC17861e.Signature("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(AbstractC17861e.Signature("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.vip;
            default:
                return new C1635e((C14679e) this.vip);
        }
    }
}

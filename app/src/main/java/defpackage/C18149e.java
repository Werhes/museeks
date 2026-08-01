package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18149e implements InterfaceC12179e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f35558e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35559e;

    public /* synthetic */ C18149e(int i, Object obj) {
        this.f35559e = i;
        this.f35558e = obj;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        View view;
        switch (this.f35559e) {
            case 0:
                InterfaceC10998e interfaceC10998e = (InterfaceC10998e) this.f35558e;
                if (enumC14621e != EnumC14621e.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC16400e.vip().vip(this);
                Bundle isPro = interfaceC10998e.yandex().isPro("androidx.savedstate.Restarter");
                if (isPro == null) {
                    return;
                }
                ArrayList<String> stringArrayList = isPro.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C18149e.class.getClassLoader()).asSubclass(InterfaceC12290e.class);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                ((C6825e) ((InterfaceC12290e) declaredConstructor.newInstance(null))).getClass();
                                if (!(interfaceC10998e instanceof InterfaceC0816e)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC10998e).toString());
                                }
                                C13462e billing = ((InterfaceC0816e) interfaceC10998e).billing();
                                C3168e yandex = interfaceC10998e.yandex();
                                billing.getClass();
                                LinkedHashMap linkedHashMap = billing.ad;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    AbstractC13960e abstractC13960e = (AbstractC13960e) linkedHashMap.get((String) it.next());
                                    if (abstractC13960e != null) {
                                        AbstractC1206e.metrica(abstractC13960e, yandex, interfaceC10998e.vip());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    yandex.m1263e();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC17861e.Signature("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(AbstractC5087e.m1746extends("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                AbstractActivityC15824e abstractActivityC15824e = (AbstractActivityC15824e) this.f35558e;
                if (abstractActivityC15824e.f31237e == null) {
                    C1953e c1953e = (C1953e) abstractActivityC15824e.getLastNonConfigurationInstance();
                    if (c1953e != null) {
                        abstractActivityC15824e.f31237e = c1953e.ad;
                    }
                    if (abstractActivityC15824e.f31237e == null) {
                        abstractActivityC15824e.f31237e = new C13462e();
                    }
                }
                abstractActivityC15824e.f8255e.vip(this);
                return;
            case 2:
                new HashMap();
                InterfaceC3823e[] interfaceC3823eArr = (InterfaceC3823e[]) this.f35558e;
                if (interfaceC3823eArr.length > 0) {
                    InterfaceC3823e interfaceC3823e = interfaceC3823eArr[0];
                    throw null;
                }
                if (interfaceC3823eArr.length <= 0) {
                    return;
                }
                InterfaceC3823e interfaceC3823e2 = interfaceC3823eArr[0];
                throw null;
            case 3:
                if (enumC14621e != EnumC14621e.ON_STOP || (view = ((AbstractComponentCallbacksC17875e) this.f35558e).f35098e) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (enumC14621e != EnumC14621e.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC14621e).toString());
                }
                interfaceC16400e.vip().vip(this);
                ((C15983e) this.f35558e).vip();
                return;
        }
    }
}

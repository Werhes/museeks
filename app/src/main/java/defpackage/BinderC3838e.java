package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC3838e extends AbstractBinderC3782e implements InterfaceC15751e {
    public final Object license;

    public BinderC3838e(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 3);
        this.license = obj;
    }

    /* renamed from: eٜؑ٘, reason: contains not printable characters */
    public static Object m1403e(InterfaceC15751e interfaceC15751e) {
        if (interfaceC15751e instanceof BinderC3838e) {
            return ((BinderC3838e) interfaceC15751e).license;
        }
        IBinder asBinder = interfaceC15751e.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(AbstractC8647e.isPro(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        }
        AbstractC9528e.startapp(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eٖ٘ؔ, eؚٕ۟] */
    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    public static InterfaceC15751e m1404e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof InterfaceC15751e ? (InterfaceC15751e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }
}

package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219e extends C6607e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C10068e f3858e = new C10068e(12);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static C1219e f3859e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Application f3860e;

    public C1219e(Application application) {
        super(12);
        this.f3860e = application;
    }

    public static AbstractC13960e premium(Class cls, Application application) {
        if (!AbstractC5054e.class.isAssignableFrom(cls)) {
            return AbstractC4465e.purchase(cls);
        }
        try {
            return (AbstractC13960e) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "), e4);
        }
    }

    @Override // defpackage.C6607e, defpackage.InterfaceC1481e
    public final AbstractC13960e billing(Class cls, C8229e c8229e) {
        if (this.f3860e != null) {
            return license(cls);
        }
        Application application = (Application) c8229e.ad.get(f3858e);
        if (application != null) {
            return premium(cls, application);
        }
        if (AbstractC5054e.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return AbstractC4465e.purchase(cls);
    }

    @Override // defpackage.C6607e, defpackage.InterfaceC1481e
    public final AbstractC13960e license(Class cls) {
        Application application = this.f3860e;
        if (application != null) {
            return premium(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}

package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12602e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25325e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f25326e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f25327e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f25328e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12602e(C11258e c11258e, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f25325e = 2;
        this.f25327e = c11258e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12602e(Object obj, Object obj2, Object obj3, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f25325e = i;
        this.f25328e = obj;
        this.f25326e = obj2;
        this.f25327e = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f25325e) {
            case 0:
                return ((C12602e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C12602e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C12602e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C12602e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C12602e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C12602e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12602e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        long Signature;
        String str;
        Object vip;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        int i = this.f25325e;
        int i2 = 2;
        C18217e c18217e = null;
        boolean z = false;
        boolean z2 = false;
        Object obj2 = this.f25327e;
        ?? r4 = "call to 'resume' before 'invoke' with coroutine";
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                Object obj3 = this.f25326e;
                C14995e c14995e = (C14995e) this.f25328e;
                int i3 = this.f25329e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    ((C0576e) c14995e.appmetrica).setValue(obj3);
                    C8812e c8812e = new C8812e(c14995e, 3);
                    C14869e c14869e = new C14869e(obj2, (Object) c14995e, (InterfaceC5083e) (z ? 1 : 0), 4);
                    this.f25329e = 1;
                    if (AbstractC11750e.metrica(c8812e, c14869e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                if (((Boolean) ((Function1) c14995e.ad).invoke(obj3)).booleanValue()) {
                    ((C5624e) c14995e.mopub).ad(c14995e.startapp().purchase(obj3), ((C2616e) c14995e.adcel).purchase());
                    ((C0576e) c14995e.license).setValue(obj3);
                    c14995e.amazon(obj3);
                }
                return Unit.INSTANCE;
            case 1:
                C12856e c12856e = (C12856e) this.f25328e;
                int i4 = this.f25329e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5891e m1243e = ((C3168e) c12856e.metrica.f23069e).m1243e("ktor.application.startupTimeoutMillis");
                    if (m1243e == null || (str = (String) ((Map) m1243e.f12440e).get((String) m1243e.f12439e)) == null) {
                        C17647e c17647e = C14157e.f27993e;
                        Signature = AbstractC0326e.Signature(10, EnumC15934e.SECONDS);
                    } else {
                        long parseLong = Long.parseLong(str);
                        C17647e c17647e2 = C14157e.f27993e;
                        Signature = AbstractC0326e.admob(parseLong, EnumC15934e.MILLISECONDS);
                    }
                    C8857e c8857e = new C8857e(c12856e, (C5033e) this.f25326e, (ClassLoader) obj2, (InterfaceC5083e) null, 8);
                    this.f25329e = 1;
                    if (AbstractC8306e.adcel(Signature, c8857e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                C11258e c11258e = (C11258e) obj2;
                InterfaceC13021e interfaceC13021e = c11258e.vip;
                File file = c11258e.ad;
                int i5 = this.f25329e;
                try {
                    try {
                    } catch (Throwable th2) {
                        Closeable closeable = r4;
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC16704e.vip(closeable, th2);
                            throw th3;
                        }
                    }
                } catch (FileNotFoundException unused) {
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            this.f25328e = null;
                            this.f25326e = fileInputStream;
                            this.f25329e = 2;
                            vip = interfaceC13021e.metrica(fileInputStream);
                            if (vip == enumC2821e) {
                                return enumC2821e;
                            }
                            fileInputStream2 = fileInputStream;
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                AbstractC16704e.vip(fileInputStream, th);
                                throw th5;
                            }
                        }
                    } else {
                        vip = interfaceC13021e.vip();
                    }
                }
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    try {
                        FileInputStream fileInputStream3 = new FileInputStream(file);
                        this.f25328e = fileInputStream3;
                        this.f25326e = null;
                        this.f25329e = 1;
                        vip = interfaceC13021e.metrica(fileInputStream3);
                        r4 = fileInputStream3;
                        if (vip == enumC2821e) {
                            return enumC2821e;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw AbstractC9408e.metrica(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream2 = (FileInputStream) this.f25326e;
                        try {
                            AbstractC2003e.purchase(obj);
                            vip = obj;
                            AbstractC16704e.vip(fileInputStream2, null);
                            return vip;
                        } catch (Throwable th6) {
                            th = th6;
                            fileInputStream = fileInputStream2;
                            th = th;
                            throw th;
                        }
                    }
                    FileInputStream fileInputStream4 = (FileInputStream) this.f25328e;
                    AbstractC2003e.purchase(obj);
                    vip = obj;
                    r4 = fileInputStream4;
                }
                AbstractC16704e.vip(r4, null);
                return vip;
            case 3:
                int i6 = this.f25329e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    C1633e c1633e = (C1633e) this.f25328e;
                    SessionWorker sessionWorker = (SessionWorker) this.f25326e;
                    Context context = sessionWorker.f605e;
                    C16007e c16007e = (C16007e) obj2;
                    C11885e c11885e = sessionWorker.f435e;
                    C10673e c10673e = new C10673e(14, sessionWorker);
                    this.f25329e = 1;
                    if (AbstractC7902e.ad(c1633e, context, c16007e, c11885e, c10673e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return new C17239e(C13198e.metrica);
            case 4:
                C0593e c0593e = (C0593e) obj2;
                EnumC6955e enumC6955e = (EnumC6955e) this.f25326e;
                C6540e c6540e = (C6540e) this.f25328e;
                int i7 = this.f25329e;
                EnumC6955e enumC6955e2 = EnumC6955e.f14253e;
                try {
                    if (i7 == 0) {
                        AbstractC2003e.purchase(obj);
                        if (!c6540e.ad && enumC6955e != EnumC6955e.f14254e) {
                            C17071e c17071e = new C17071e(c0593e, z2 ? 1 : 0, i2);
                            this.f25329e = 2;
                            if (AbstractC8306e.startapp(1500L, c17071e, this) == enumC2821e) {
                                return enumC2821e;
                            }
                        }
                        this.f25329e = 1;
                        if (c0593e.invoke(this) == enumC2821e) {
                            return enumC2821e;
                        }
                    } else {
                        if (i7 != 1 && i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                    }
                    if (enumC6955e != enumC6955e2) {
                        c6540e.ad();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th7) {
                    if (enumC6955e != enumC6955e2) {
                        c6540e.ad();
                    }
                    throw th7;
                }
            case 5:
                int i8 = this.f25329e;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                this.f25329e = 1;
                Object advert = C12810e.advert((C12810e) this.f25328e, EnumC4385e.f9555e, (Map) this.f25326e, (EnumC13734e) obj2, this);
                return advert == enumC2821e ? enumC2821e : advert;
            default:
                C12810e c12810e = (C12810e) this.f25328e;
                int i9 = this.f25329e;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
                }
                LinkedHashMap linkedHashMap = c12810e.mopub;
                C8823e c8823e = C12810e.advert;
                C11456e c11456e = (C11456e) this.f25326e;
                C13935e c13935e = new C13935e(5);
                c13935e.m3731class(c11456e);
                linkedHashMap.put(EnumC4385e.f9554e, new C15388e(c13935e, new LinkedHashMap((Map) obj2), c18217e, 12));
                C15388e smaato = C12810e.smaato(c12810e.mopub);
                this.f25329e = 1;
                Object loadAd = c12810e.loadAd(smaato, null, this);
                return loadAd == enumC2821e ? enumC2821e : loadAd;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f25325e) {
            case 0:
                return new C12602e((C14995e) this.f25328e, this.f25326e, (Function4) this.f25327e, interfaceC5083e, 0);
            case 1:
                return new C12602e((C12856e) this.f25328e, (C5033e) this.f25326e, (ClassLoader) this.f25327e, interfaceC5083e, 1);
            case 2:
                return new C12602e((C11258e) this.f25327e, interfaceC5083e);
            case 3:
                return new C12602e((C1633e) this.f25328e, (SessionWorker) this.f25326e, (C16007e) this.f25327e, interfaceC5083e, 3);
            case 4:
                return new C12602e((C6540e) this.f25328e, (EnumC6955e) this.f25326e, (C0593e) this.f25327e, interfaceC5083e, 4);
            case 5:
                return new C12602e((C12810e) this.f25328e, (Map) this.f25326e, (EnumC13734e) this.f25327e, interfaceC5083e, 5);
            default:
                return new C12602e((C12810e) this.f25328e, (C11456e) this.f25326e, (Map) this.f25327e, interfaceC5083e, 6);
        }
    }
}

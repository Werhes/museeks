package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10479e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f20694e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20695e;

    public /* synthetic */ C10479e(int i, Object obj) {
        this.f20695e = i;
        this.f20694e = obj;
    }

    public /* synthetic */ C10479e(C16929e c16929e, C0764e c0764e) {
        this.f20695e = 13;
        this.f20694e = c0764e;
    }

    private final Object ad() {
        File file = (File) this.f20694e;
        synchronized (C4913e.appmetrica) {
            C4913e.license.remove(file.getAbsolutePath());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C5070e state;
        InterfaceC8018e interfaceC8018e;
        float f = 0.0f;
        switch (this.f20695e) {
            case 0:
                C14452e c14452e = (C14452e) this.f20694e;
                if (c14452e.m3801package() == EnumC1143e.f3719e) {
                    C0002e c0002e = C0002e.appmetrica;
                    int metrica = c0002e.metrica(c14452e.f27451e.getApplicationContext(), C17991e.ad);
                    int i = AbstractC18410e.appmetrica;
                    if (metrica == 1 || metrica == 2 || metrica == 3 || metrica == 9) {
                        c0002e.appmetrica(c14452e.pro(), metrica, 100, null);
                    }
                } else if (c14452e.m3801package() == EnumC1143e.f3720e) {
                    if (c14452e.f28566e) {
                        Activity pro = c14452e.pro();
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", c14452e.pro().getPackageName(), null));
                        pro.startActivity(intent);
                    } else {
                        AbstractC10077e.ads(c14452e.pro(), c14452e.f28564e, 1039);
                    }
                } else if (c14452e.m3801package() == EnumC1143e.f3718e) {
                    Activity pro2 = c14452e.pro();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.fromParts("package", "com.google.android.gms", null));
                    pro2.startActivity(intent2);
                }
                return Unit.INSTANCE;
            case 1:
                C12604e c12604e = (C12604e) this.f20694e;
                long j = c12604e.vip;
                return Float.valueOf(((float) (j - c12604e.ad)) / ((float) j));
            case 2:
                Exception exc = (Exception) this.f20694e;
                DecimalFormat decimalFormat = C5575e.ad;
                C5575e.ad(AbstractC13362e.advert(exc));
                return Unit.INSTANCE;
            case 3:
                C13877e c13877e = (C13877e) this.f20694e;
                c13877e.f27487e.setValue(c13877e.m3688private());
                return Unit.INSTANCE;
            case 4:
                return new C2157e(AbstractC13480e.crashlytics(((C2157e) this.f20694e).ad));
            case 5:
                ((C12344e) this.f20694e).license(C14577e.ad);
                return Unit.INSTANCE;
            case 6:
                Context context = (Context) ((C11106e) this.f20694e).f22008e;
                int intValue = ((Integer) AbstractC2589e.ad.get()).intValue();
                if (Build.VERSION.SDK_INT < 27) {
                    intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                }
                return Integer.valueOf(intValue);
            case 7:
                return ((Iterable) this.f20694e).iterator();
            case 8:
                Function0 function0 = ((C13136e) this.f20694e).f26111e;
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 9:
                return Collections.singletonList((C6571e) this.f20694e);
            case 10:
                return Integer.valueOf(((C13107e) this.f20694e).vip.size());
            case 11:
                return Boolean.valueOf(((EnumC11762e) ((C0576e) ((C2628e) this.f20694e).ad.metrica).getValue()) != EnumC11762e.f23636e);
            case 12:
                return AbstractC10024e.ad(((C16929e) this.f20694e).pro());
            case 13:
                C0764e c0764e = (C0764e) this.f20694e;
                InterfaceC16132e interfaceC16132e = c0764e.f3119e;
                C5267e c5267e = (C5267e) interfaceC16132e.getValue();
                List list = ((C5267e) interfaceC16132e.getValue()).f11346e;
                C1158e c1158e = C1158e.f3743e;
                c0764e.setValue(C5267e.vip(c5267e, false, false, 0, 0, AbstractC13480e.m3572catch(new C14056e(85.0f, 1.0f, -45.0f, f), list), 47));
                return Unit.INSTANCE;
            case 14:
                return ((C7911e) this.f20694e).license();
            case 15:
                return new C17210e((EnumC17426e) this.f20694e, 0.0f);
            case 16:
                return ((C13732e) this.f20694e).ad();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                DedicatedCacheMigrationService dedicatedCacheMigrationService = (DedicatedCacheMigrationService) this.f20694e;
                int i2 = DedicatedCacheMigrationService.f36555e;
                return new C13599e(dedicatedCacheMigrationService);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C0360e) this.f20694e).metrica.mo3341class(34);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((InterfaceC10601e) this.f20694e).close();
                return Unit.INSTANCE;
            case 20:
                InterfaceC2566e interfaceC2566e = ((C2702e) this.f20694e).subscription;
                if (interfaceC2566e != null && (state = interfaceC2566e.getState()) != null) {
                    f = state.ad();
                }
                return Float.valueOf(f);
            case 21:
                return (InterfaceC4911e) this.f20694e;
            case 22:
                ((C14875e) this.f20694e).f29469e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 23:
                return new C0507e(2, (C5530e) this.f20694e);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C12856e c12856e = (C12856e) this.f20694e;
                C8422e c8422e = c12856e.license;
                long j2 = c8422e.ad;
                long j3 = c8422e.vip;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                try {
                    C10709e c10709e = c12856e.smaato;
                    long millis = timeUnit.toMillis(j2);
                    long millis2 = timeUnit.toMillis(j3);
                    c10709e.getClass();
                    AbstractC5336e.yandex(C2693e.f6576e, new C8045e(c10709e, millis, millis2, null));
                } catch (Exception e) {
                    ((InterfaceC4911e) c12856e.metrica.f23070e).advert(e);
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c12856e.appmetrica;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c12856e.purchase();
                    Unit unit = Unit.INSTANCE;
                    for (int i4 = 0; i4 < readHoldCount; i4++) {
                        readLock.lock();
                    }
                    writeLock.unlock();
                    if (!c12856e.adcel.isEmpty()) {
                        c12856e.metrica();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    for (int i5 = 0; i5 < readHoldCount; i5++) {
                        readLock.lock();
                    }
                    writeLock.unlock();
                    throw th;
                }
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C12284e) this.f20694e).f24635e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C4126e) this.f20694e).f9091e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ad();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C15861e c15861e = (C15861e) this.f20694e;
                InterfaceC8910e interfaceC8910e = c15861e.ad;
                C6302e c6302e = c15861e.vip;
                InterfaceC8910e license = AbstractC14385e.license(interfaceC8910e, true);
                try {
                    Movie decodeStream = Movie.decodeStream(license.mo2321e().mo1680e());
                    AbstractC18453e.ad(license, null);
                    if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                        throw new IllegalStateException("Failed to decode GIF.");
                    }
                    C12458e c12458e = new C12458e(decodeStream, (decodeStream.isOpaque() && ((Boolean) AbstractC8306e.license(c6302e, AbstractC15659e.billing)).booleanValue()) ? Bitmap.Config.RGB_565 : AbstractC11815e.firebase(AbstractC15659e.vip(c6302e)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) AbstractC8306e.license(c6302e, AbstractC15659e.vip), c6302e.metrica);
                    C12916e c12916e = AbstractC13467e.ad;
                    if (((Number) AbstractC8306e.license(c6302e, c12916e)).intValue() != -2) {
                        int intValue2 = ((Number) AbstractC8306e.license(c6302e, c12916e)).intValue();
                        if (intValue2 < -1) {
                            throw new IllegalArgumentException(AbstractC1786e.admob(intValue2, "Invalid repeatCount: ").toString());
                        }
                        c12458e.f24937e = intValue2;
                    }
                    Function0 function02 = (Function0) AbstractC8306e.license(c6302e, AbstractC13467e.metrica);
                    Function0 function03 = (Function0) AbstractC8306e.license(c6302e, AbstractC13467e.license);
                    if (function02 != null || function03 != null) {
                        c12458e.f24929e.add(new C12014e(function02, function03));
                    }
                    if (AbstractC8306e.license(c6302e, AbstractC13467e.vip) != null) {
                        throw new ClassCastException();
                    }
                    c12458e.f24935e = null;
                    c12458e.f24942e = 1;
                    c12458e.f24948e = false;
                    c12458e.invalidateSelf();
                    return new C7132e(AbstractC15143e.vip(c12458e), false);
                } finally {
                }
            default:
                C1890e c1890e = (C1890e) this.f20694e;
                synchronized (C1890e.license) {
                    try {
                        interfaceC8018e = C1890e.purchase;
                        if (interfaceC8018e == null) {
                            File metrica2 = AbstractC2745e.metrica(c1890e.ad, "GlanceAppWidgetManager".concat(".preferences_pb"));
                            File file = metrica2.exists() ? metrica2 : null;
                            if (file != null) {
                                file.delete();
                            }
                            Context context2 = c1890e.ad;
                            C11354e c11354e = C1890e.appmetrica;
                            InterfaceC8614e interfaceC8614e = C5749e.ad[0];
                            interfaceC8018e = (InterfaceC8018e) c11354e.ad(context2);
                            C1890e.purchase = interfaceC8018e;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return interfaceC8018e;
        }
    }
}

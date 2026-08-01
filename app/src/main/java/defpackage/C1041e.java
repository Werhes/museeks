package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C10675e f3499e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Context f3500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041e(C10675e c10675e, Context context, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3499e = c10675e;
        this.f3500e = context;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C1041e(this.f3499e, this.f3500e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1041e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Uri license = FileProvider.license(vKXApplication, this.f3499e.toFile());
        Context context = this.f3500e;
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        InputStream openInputStream = context.getContentResolver().openInputStream(license);
        if (openInputStream == null) {
            return null;
        }
        try {
            long appmetrica = AbstractC5097e.appmetrica(context, license);
            PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
            sessionParams.setAppPackageName("ua.itaysonlab.vkx");
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                sessionParams.setInstallReason(4);
            }
            if (i >= 31) {
                sessionParams.setRequireUserAction(2);
            }
            if (i >= 33) {
                sessionParams.setPackageSource(4);
            }
            PackageInstaller.Session openSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
            OutputStream openWrite = openSession.openWrite("vkx_libota", 0L, appmetrica);
            try {
                AbstractC13671e.license(openInputStream, openWrite);
                openSession.fsync(openWrite);
                Unit unit = Unit.INSTANCE;
                AbstractC16704e.vip(openWrite, null);
                openSession.commit(PendingIntent.getActivity(context, 39727, new Intent(context, (Class<?>) AppActivity.class), C7290e.adcel()).getIntentSender());
                openSession.close();
                openInputStream.close();
                return Unit.INSTANCE;
            } finally {
            }
        } finally {
        }
    }
}

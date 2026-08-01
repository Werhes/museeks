package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477e {
    public static volatile C0477e mopub;
    public final DisplayManager appmetrica;
    public volatile Display[] license;
    public volatile Size purchase;
    public static final C10990e billing = new C10990e(29);
    public static final Size yandex = new Size(1920, 1080);
    public static final Size startapp = new Size(320, 240);
    public static final Size adcel = new Size(640, 480);
    public final C17974e ad = new C17974e(16);
    public final C2362e vip = new C2362e(11);
    public final Object metrica = new Object();

    public C0477e(Context context) {
        C17940e c17940e = new C17940e(0, this);
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(c17940e, new Handler(Looper.getMainLooper()));
        this.appmetrica = displayManager;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Map, java.lang.Object] */
    public final Size ad() {
        Size license;
        Point point = new Point();
        vip(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (AbstractC2084e.ad(size) < AbstractC2084e.ad(startapp)) {
            Size size2 = ((SmallDisplaySizeQuirk) this.vip.f5914e) != null ? (Size) SmallDisplaySizeQuirk.ad.get(Build.MODEL.toUpperCase(Locale.ROOT)) : null;
            if (size2 == null) {
                size2 = adcel;
            }
            size = size2;
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        Size size3 = yandex;
        if (AbstractC2084e.ad(size3) < AbstractC2084e.ad(size)) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.ad.f35233e) != null && (license = ExtraCroppingQuirk.license(EnumC14212e.f28078e)) != null) {
            if (license.getHeight() * license.getWidth() > size.getHeight() * size.getWidth()) {
                return license;
            }
        }
        return size;
    }

    public final Size metrica() {
        synchronized (this.metrica) {
            if (this.purchase != null) {
                return this.purchase;
            }
            this.purchase = ad();
            return this.purchase;
        }
    }

    public final Display vip(boolean z) {
        Display[] displayArr;
        int i;
        synchronized (this.metrica) {
            displayArr = this.license;
            if (displayArr == null) {
                displayArr = this.appmetrica.getDisplays();
                this.license = displayArr;
            }
        }
        if (displayArr.length == 1) {
            return displayArr[0];
        }
        int i2 = -1;
        Display display = null;
        Display display2 = null;
        int i3 = -1;
        for (Display display3 : displayArr) {
            Point point = new Point();
            display3.getRealSize(point);
            int i4 = point.x * point.y;
            if (i4 > i2) {
                display = display3;
                i2 = i4;
            }
            if (display3.getState() != 1 && (i = point.x * point.y) > i3) {
                display2 = display3;
                i3 = i;
            }
        }
        if (z && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        throw new IllegalStateException(("No displays found from " + Arrays.toString(displayArr) + '!').toString());
    }
}

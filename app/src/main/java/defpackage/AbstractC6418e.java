package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SNIHostName;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6418e {
    public static void Signature(ScheduledExecutorServiceC10910e scheduledExecutorServiceC10910e) {
        boolean isTerminated;
        ExecutorService executorService = scheduledExecutorServiceC10910e.f16265e;
        if ((Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC10910e != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            scheduledExecutorServiceC10910e.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        scheduledExecutorServiceC10910e.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ OutputConfiguration ad(int i, Surface surface) {
        return new OutputConfiguration(i, surface);
    }

    public static /* synthetic */ void adcel(ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e) {
        if (Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC5380e != ForkJoinPool.commonPool()) {
            scheduledExecutorServiceC5380e.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void admob() {
        if (Build.VERSION.SDK_INT <= 23 || ForkJoinPool.commonPool() != null) {
            throw null;
        }
    }

    public static void advert(C3598e c3598e) {
        boolean isTerminated;
        ExecutorService executorService = c3598e.f3342e;
        if ((Build.VERSION.SDK_INT <= 23 || c3598e != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            c3598e.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        c3598e.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void amazon(AbstractExecutorServiceC1585e abstractExecutorServiceC1585e) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || abstractExecutorServiceC1585e != ForkJoinPool.commonPool()) && !(isTerminated = abstractExecutorServiceC1585e.isTerminated())) {
            abstractExecutorServiceC1585e.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = abstractExecutorServiceC1585e.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        abstractExecutorServiceC1585e.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ LocaleSpan appmetrica(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void billing() {
    }

    public static /* synthetic */ LocaleList license(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static void loadAd(C8013e c8013e) {
        boolean isTerminated;
        ExecutorService executorService = c8013e.f16265e;
        if ((Build.VERSION.SDK_INT <= 23 || c8013e != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            c8013e.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        c8013e.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern metrica() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static void mopub(C0918e c0918e) {
        boolean isTerminated;
        ExecutorService executorService = c0918e.f3342e;
        if ((Build.VERSION.SDK_INT <= 23 || c0918e != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            c0918e.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        c0918e.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ SNIHostName purchase(String str) {
        return new SNIHostName(str);
    }

    public static /* synthetic */ void remoteconfig() {
    }

    public static /* synthetic */ void smaato(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void startapp(ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e) {
        if ((Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC5603e != ForkJoinPool.commonPool()) && !scheduledExecutorServiceC5603e.f11957e.isTerminated()) {
            scheduledExecutorServiceC5603e.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void subscription() {
    }

    public static /* synthetic */ OutputConfiguration vip(Surface surface) {
        return new OutputConfiguration(surface);
    }

    public static /* synthetic */ void yandex(ExecutorC14931e executorC14931e) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorC14931e != ForkJoinPool.commonPool()) && !(isTerminated = executorC14931e.isTerminated())) {
            executorC14931e.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorC14931e.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorC14931e.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

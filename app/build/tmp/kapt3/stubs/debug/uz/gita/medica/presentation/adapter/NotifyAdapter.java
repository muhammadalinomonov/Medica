package uz.gita.medica.presentation.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Luz/gita/medica/presentation/adapter/NotifyAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/gita/medica/data/models/NotifyData;", "Luz/gita/medica/presentation/adapter/NotifyAdapter$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyDiffUtil", "ViewHolder", "app_debug"})
public final class NotifyAdapter extends androidx.recyclerview.widget.ListAdapter<uz.gita.medica.data.models.NotifyData, uz.gita.medica.presentation.adapter.NotifyAdapter.ViewHolder> {
    
    public NotifyAdapter() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public uz.gita.medica.presentation.adapter.NotifyAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    uz.gita.medica.presentation.adapter.NotifyAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/gita/medica/presentation/adapter/NotifyAdapter$MyDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/gita/medica/data/models/NotifyData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class MyDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.gita.medica.data.models.NotifyData> {
        @org.jetbrains.annotations.NotNull
        public static final uz.gita.medica.presentation.adapter.NotifyAdapter.MyDiffUtil INSTANCE = null;
        
        private MyDiffUtil() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.medica.data.models.NotifyData oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.medica.data.models.NotifyData newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.medica.data.models.NotifyData oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.medica.data.models.NotifyData newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/gita/medica/presentation/adapter/NotifyAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/gita/a5/medica/databinding/ItemNotificationBinding;", "(Luz/gita/medica/presentation/adapter/NotifyAdapter;Luz/gita/a5/medica/databinding/ItemNotificationBinding;)V", "bind", "", "news_item", "Luz/gita/medica/data/models/NotifyData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final uz.gita.a5.medica.databinding.ItemNotificationBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        uz.gita.a5.medica.databinding.ItemNotificationBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        uz.gita.medica.data.models.NotifyData news_item) {
        }
    }
}